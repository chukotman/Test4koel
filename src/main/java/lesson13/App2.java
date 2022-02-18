package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        Integer[]nums = {1,34,1,4,63,1,56,1,21,3,4,6,67,-7,7,8787};
        List<Integer> numbers = Arrays.asList(nums);

        System.out.println(numbers);


        Person anna = new Person("Anna");
        Person david = new Person("David");
        List<Person> people = new ArrayList<>();

        people.add(anna);
        people.add(david);
        people.add(new Person("Alex"));
        people.add(new Person("Anna"));

        System.out.println(people.get(0)==anna);



    }
}
