import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        Employee mrBull=new Employee("Mr", "Bull", "Builder", 45000.0);
        Employee missRabbit=new Employee("Miss", "Rabbit", "Driver", 35000.0);
        Employee mrPotato=new Employee("Mr", "Potato", "TV host", 58000.0);
        Employee msGazelle = new Employee("Madame", "Gazelle", "Teacher", 42000.00);

        Student harry=new Student("Harry", "Potter", 3.2);
        Student hermione = new Student("Hermione", "Granger", 4.0);
        Student ron = new Student("Ron", "Weasley", 2.6);
        Student draco = new Student("Draco", "Malfoy", 3.5);

        ArrayList<Person> persons=new ArrayList<>();
        persons.add(mrBull);
        persons.add(missRabbit);
        persons.add(mrPotato);
        persons.add(msGazelle);
        persons.add(harry);
        persons.add(hermione);
        persons.add(ron);
        persons.add(draco);

        Collections.sort(persons);

        for (Person p : persons) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }

    }

}
