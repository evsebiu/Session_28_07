package Session19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandardInterfaceDemo {
    public static void main(String[] args) {
        // no input, no return, simple action.
        Runnable sayHello = () -> System.out.println("Halo from Runnable");
        sayHello.run();

       // 1 input, no return
        Consumer<String> printMessage = msg -> System.out.println("recieved " +  msg);
        printMessage.accept("\ntoday is a bad day.");

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("4 is even? " + isEven.test(4));
        System.out.println(" 7 is even? " + isEven.test(7));

        Function<String, Integer> stringLenght = str ->str.length();
        System.out.println("lenght of Lambada : " + stringLenght.apply("lambda"));

        Supplier<Double> randomValue = () ->  Math.random();
        System.out.println("random number: " + randomValue.get());

        Person p1= new Person();
        Consumer<String> setPersonName = (name) -> p1.setName(name);
        setPersonName.accept("Eusebiu");
        System.out.println(p1.getName());
    }

}

class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
