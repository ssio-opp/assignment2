import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = PersonsList.getAllPersons();
        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }

    }
}