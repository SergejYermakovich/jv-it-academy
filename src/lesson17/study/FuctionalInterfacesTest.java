package lesson17.study;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuctionalInterfacesTest {

    final static Random random = new Random();


    public static void main(String[] args) {
        Consumer<String> consumer = (message) -> {
            System.out.println("Message is: " + message);
        };
        consumer.accept("bla bla!!!!");
        /*---------------------------------------------------------*/

        Supplier<Integer> supplier = () -> {
            return random.nextInt(10);
        };
        System.out.println(supplier.get());

        /*---------------------------------------------------------*/


        Predicate<String> isHumanPredicate = (name) -> {
            return name.contains("human");
        };
        System.out.println(isHumanPredicate.test("human"));
        System.out.println(isHumanPredicate.test("alien"));

        /*---------------------------------------------------------*/
        Function<Integer, String> ageCheck = (age) -> {
            if (age < 18) {
                return "You are too young!!!";
            } else {
                return "it s okay";
            }
        };

        System.out.println(
                ageCheck.apply(19)
        );


        test((message) -> {
            System.out.println("Message is: " + message);
        });


    }

    public static void test(Consumer<String> consumer) {
        consumer.accept("message,......");
    }
}
