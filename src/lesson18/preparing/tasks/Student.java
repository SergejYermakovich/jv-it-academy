package lesson18.preparing.tasks;

// 2. Создайте класс для хранения информации о студенте (имя, возраст, средний балл) и напишите метод для вывода этой информации на экран.
public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void printInfo() {
        System.out.println("Student: ");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("grade: " + averageGrade);

        System.out.println();
    }

    public static void main(String[] args) {
        Student student = new Student("Anatolii", 19, 8.1);
        student.printInfo();
    }
}
