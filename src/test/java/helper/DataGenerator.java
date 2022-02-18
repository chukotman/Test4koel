package helper;

import com.github.javafaker.Faker;
import enums.OrderStatus;
import enums.Status;
import models.Category;
import models.Order;
import models.Pet;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static Pet getRandomPet(){
        Random random = new Random();
        Faker faker = new Faker();
        String name = faker.funnyName().name();
        String[] url = {faker.internet().image(), faker.internet().image()};
        Category category = new Category(faker.superhero().name(),random.nextLong());
        Tag[]tags = {new Tag(faker.animal().name(),random.nextLong())};

        return new Pet(name,url, Status.pending,category,tags);
    }
    //The method
    public static Order getRandomOrder(){
        long petId = new Random().nextLong();
        int quantity = new Random().nextInt();
        String shipDate = dateAndTimeGen();
        boolean complete = true;

        return new Order(petId, quantity, shipDate, OrderStatus.placed, complete);

    }
    //The function returns String value of random date and time included
    public static String dateAndTimeGen(){
        LocalDate start = LocalDate.of(2021, Month.DECEMBER, 1);
        LocalDate end = LocalDate.now();
        LocalDate randomDate = between(start, end);
        LocalTime evening = LocalTime.of(20, 30);
        LocalTime randomTime = between(LocalTime.NOON, evening);

        return randomDate+"T"+randomTime;
    }
    //The function returns random date between within the limits
    public static LocalDate between(LocalDate startInclusive, LocalDate endExclusive) {
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
    //The function returns random time between within the limits
    public static LocalTime between(LocalTime startTime, LocalTime endTime) {
        int startSeconds = startTime.toSecondOfDay();
        int endSeconds = endTime.toSecondOfDay();
        int randomTime = ThreadLocalRandom
                .current()
                .nextInt(startSeconds, endSeconds);

        return LocalTime.ofSecondOfDay(randomTime);
    }
}


