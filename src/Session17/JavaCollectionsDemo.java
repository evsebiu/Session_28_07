package Session17;

import java.util.*;

public class JavaCollectionsDemo {
    public static void main(String[] args) {

        //listDemo();
        //setDemo();
        mapDemo();
    }

    public static void listDemo(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            numbers.add(i * 10);
        }
        System.out.println(numbers);

        numbers.add(3,25);
        System.out.println(numbers);

        numbers.set(3,26);
        System.out.println(numbers);

        System.out.println(numbers.contains(26));
        System.out.println(numbers.contains(25));

        for (int number : numbers){
            System.out.println(number);
        }


    }
    enum Day{LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA}
    public static void setDemo(){
        Set<String> students = new HashSet<>();
        students.add("John");
        students.add("Jane");
        students.add("John"); // Duplicate, will not be added
        students.add("Alis");
        System.out.println(students);

        students.remove("Alis");
        System.out.println(students);
        System.out.println(students.contains("John"));

        EnumSet<Day> days = EnumSet.range(Day.LUNI, Day.VINERI);
        System.out.println(days);
        days.add(Day.VINERI);
        System.out.println(days);
        days.add(Day.DUMINICA);
        System.out.println(days);

    }

    public static void mapDemo(){
        Map <String,Integer> students = new HashMap<>();
        students.put("Marcel", 29);
        students.put("Eusebius", 21);
        students.put("Malone" , 25);
        System.out.println(students);
        students.put("Marcel", 31);
        System.out.println(students);
        System.out.println("Eusebius age: " + students.get("Eusebius"));
        System.out.println(students.get("Marcel"));


        for (String name : students.keySet()){
            System.out.println(name + " are varsta " + students.get(name));
        }
        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println( entry.getKey() + " are varsta " + entry.getValue());
        }
    students.remove("Mihai");
        System.out.println(students);
    }

}
