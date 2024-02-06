package lesson18.preparing.tasks;

public class AgeCheckerMain {

    public static void main(String[] args) {
        AgeChecker americanAgeChecker = (student) -> student.getAge() >= 21;

        Student john = new Student("John", 17, 2.15);
        Student brad = new Student("Brad", 16, 2.45);

        System.out.println(americanAgeChecker.checkAge(john));
        System.out.println(americanAgeChecker.checkAge(brad));


    }
}
