import person.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Child("John", "Doe", 10, "School #1", true);
        people[1] = new Teenager("Jane", "Doe", 15, "School #2", true);
        people[2] = new Worker("Tom", "Smith", 30, true, "Programmer");
        people[3] = new Retiree("Alice", "Smith", 70, true, "Gardening");

        for (Person person : people) {
            System.out.print(person);
            System.out.print(". ");
            System.out.print(person.move());
            System.out.println();
        }

    }
}