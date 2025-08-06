package Session19;

import java.util.UUID;
import java.util.function.Supplier;

public class CoffeeShopApp {
    public static void main(String[] args) {

        GreetingService greeting= (name) -> System.out.println("Hello customer " + name + "welcome to our coffee shop");
        greeting.greet("Eusebiu");

        Supplier<String> idGenerator = () -> "UUID" + UUID.randomUUID().toString().substring(0,8);



    }
}

@FunctionalInterface
interface GreetingService{
    void greet(String name);
}
class Order {
    private String id;
    private String drink;

    public String getDrink(){
        return drink;
    }
    public Order(String id, String drink){
        this.drink=drink;
        this.id=id;
    }
    String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
