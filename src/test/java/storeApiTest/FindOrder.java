package storeApiTest;

import helper.DataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Order;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FindOrder {
    private final String baseUri = "https://petstore.swagger.io/v2";
    private Order order;
    private long orderId;
    @BeforeMethod
    public void placeOrder(){
        order = DataGenerator.getRandomOrder();
        System.out.println(DataGenerator.dateAndTimeGen());
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("/store/order")
                        .header("Accept","application/json")
                        .header("Content-Type","application/json")
                        .body(order)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
         orderId = json.getLong("id");
        System.out.println(orderId);
    }

    @AfterMethod
    public void deleteOrder(){
        given()
                .baseUri(baseUri)
                .basePath("/store/order/" + orderId)
                .when()
                .delete();
    }

    @Test
    public void getPetById(){
        Response response =
                given()
                        .baseUri(baseUri)
                        .basePath("/store/order/" + orderId)
                        .header("Accept","application/json")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath json = response.jsonPath();
        Order orderResponse = json.getObject("$", Order.class);
////        Category category = json.getObject("category",Category.class);
////
////        Assert.assertEquals(pet.getCategory().getId(),category.getId());
        System.out.println("OrderId = " + orderId);
        System.out.println("OrderResponce.getId = " + orderResponse.getId());
        Assert.assertEquals(orderId, orderResponse.getId());
    }
}
