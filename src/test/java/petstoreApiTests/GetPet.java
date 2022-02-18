package petstoreApiTests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import enums.Status;
import helper.DataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPet {
    private final String baseUri = "https://petstore.swagger.io/v2";
    private Pet pet;
    private long petId;
    @BeforeMethod
    public void createPet(){
        pet = DataGenerator.getRandomPet();
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("/pet")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .body(pet)
                .when()
                        .post()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        petId = json.getLong("id");
        System.out.println(petId);
    }
    @AfterMethod
    public void deletePet(){
                given()
                        .baseUri(baseUri)
                        .basePath("pet/"+petId)
                        .when()
                        .delete();
    }
    @Test
    public void getPetById(){
        Response response =
                given()
                .baseUri(baseUri)
                .basePath("pet/"+petId)
                .header("Accept","application/json")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath json = response.jsonPath();

        Pet petResponse = json.getObject("$",Pet.class);
        Category category = json.getObject("category",Category.class);

        Assert.assertEquals(pet.getCategory().getId(),category.getId());
        Assert.assertEquals(pet.getName(),petResponse.getName());
    }
    @Test
    public void updatePet(){
        Pet updatedPet = DataGenerator.getRandomPet();
        updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("/pet")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .body(updatedPet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        Pet petResponse = json.getObject("$",Pet.class);
        Category category = json.getObject("category",Category.class);

        Assert.assertEquals(updatedPet.getCategory().getId(),category.getId());
        Assert.assertEquals(updatedPet.getName(),petResponse.getName());
    }
    @Test
    public void getPetByStatus(){
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("pet/findByStatus")
                        .queryParam("status","pending")
                        .header("Accept","application/json")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        Pet[]pets = json.getObject("$",Pet[].class);
        Assert.assertEquals(pets[0].getStatus(), Status.pending);
    }
}
