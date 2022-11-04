
import com.company.Person;
        import java.util.*;
        import java .util.Collections;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Comparator;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Vanga", "Gouthami", 25),
                new Person("Matta", "Harshita", 30),
                new Person("Chilusani", "Sharishma", 35),
                new Person("Jathothu", "Parvati", 40),
                new Person("Vanga", "Vinay", 19)
        );
        //step1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

        //step2: Create a method that prints all elements in the list
        System.out.println("printing all persons");
        printConditionally(people,p -> true);
        //step3: Create a method that prints all people that have last name beginning with V

        System.out.println("printing all persons that have last name beginning with V");
        printConditionally(people, p -> p.getLastname().startsWith("V"));

        System.out.println("printing all persons with first name beginning with V");
        printConditionally(people, p -> p.getFirstName().startsWith("v"));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
