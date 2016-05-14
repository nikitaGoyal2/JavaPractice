import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by nikigoya on 5/15/2016.
 */
public class StreamExample1 {

    public static void main(String[] args) {
        List person = new ArrayList<>();
        person.add(new Person("Niki"));
        printNames(person,p->p.getName().contains("Niki"));
    }

    private static void printNames(List<Person> persons, Predicate<Person> predicate) {
        persons.stream()
                .filter(predicate)
                .map(p -> p.getName())
                .forEach(name -> System.out.println(name));
    }

    static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

