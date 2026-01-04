import java.util.ArrayList;

public class PersonsList {

    public static ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mr", "Bull", "Builder", 45000.0));
        employees.add(new Employee("Miss", "Rabbit", "Driver", 35000.0));
        employees.add(new Employee("Mr", "Potato", "TV host", 58000.0));
        employees.add(new Employee("Madame", "Gazelle", "Teacher", 42000.00));
        return employees;
    }

    public static ArrayList<Student> getStudents()
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Harry", "Potter", 3.2));
        students.add(new Student("Hermione", "Granger", 4.0));
        students.add(new Student("Ron", "Weasley", 2.6));
        students.add(new Student("Draco", "Malfoy", 3.5));
        return students;
    }

    public static ArrayList<Person> getAllPersons()
    {
        ArrayList<Person> all = new ArrayList<>();
        all.addAll(getEmployees());
        all.addAll(getStudents());
        return all;
    }
}