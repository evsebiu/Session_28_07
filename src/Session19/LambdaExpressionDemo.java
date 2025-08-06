package Session19;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Salut!");
        hello.sayHello();

        HelloName helloName = (name) -> System.out.println("Salut " + name);
        helloName.sayHello("Eusebiu");

        MathOperations addition = (a,b) -> a+b;
        MathOperations sub = (a,b) -> a-b;
        MathOperations multiply = (a,b) -> a*b;
        MathOperations division = (a,b) -> a/b;

        System.out.println(addition.compute(10,5));
        System.out.println(sub.compute(10,5));
        System.out.println(multiply.compute(10,5));
        System.out.println(division.compute(10,5));

        System.out.println();
        textTransform toUpper = text -> text.toUpperCase();
        System.out.println(toUpper.transform(" today i had a very bad day."));
    }


}

@FunctionalInterface
interface Hello{
    void sayHello();
}

@FunctionalInterface
interface HelloName{
    void sayHello(String name);
}

@FunctionalInterface
interface MathOperations{
    int compute(int a, int b);
}
@FunctionalInterface
interface textTransform{
    String transform(String text);
}