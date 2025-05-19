package OOP.asigment2.asigment2_2;

public class task9 {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}
class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
