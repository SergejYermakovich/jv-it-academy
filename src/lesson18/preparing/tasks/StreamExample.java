package lesson18.preparing.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamExample {
    public static void main(String[] args) {

        List<Student> allStudents = getAllStudents();

         Student normalStudent = allStudents.stream()
                .filter(student -> student.getAge() < 19 && student.getAge() >= 17)
                .filter(student -> student.getAverageGrade() > 7.0)
                .limit(1).findFirst().get();

        normalStudent.printInfo();
    }

   static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String[] names = {"Sergey", "Dasha", "Kirill", "Slava"};
        Random random = new Random();
        for (int i = 0; i< 100; i++) {
            students.add(
                    new Student(names[random.nextInt(names.length)], random.nextInt(24) + 15, random.nextDouble(9.0))
            );
        }
        return students;
    }
}
