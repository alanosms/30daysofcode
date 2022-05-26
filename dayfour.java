import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge >= 1) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void yearPasses() {
        this.age = age += 1;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if ((age >= 13) && (age < 18)) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numberOfTestCase = scan.nextInt();
        for (int initialCount = 0; initialCount < numberOfTestCase; initialCount++) {
            int age = scan.nextInt();
            Person newPerson = new Person(age);
            newPerson.amIOld();

            for (int inicialCount = 0; inicialCount < 3; inicialCount++) {
                newPerson.yearPasses();
            }
            newPerson.amIOld();
            System.out.println("");
        }

    }
}
