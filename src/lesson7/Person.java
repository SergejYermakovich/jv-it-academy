package lesson7;

import java.util.Objects;

public class Person {

    public static int staticAge = 9;
    private int age;
    private String name;
    private String surname;
    private String nationality;

    public Person(int age) {
        this.age = age;

        name =  "Ivan";
        surname = "Ivanov";
        nationality = "Belarus";

        System.out.println("конструктор c параметрами!!!");
    }

    public Person() {
        System.out.println("конструктор по-умолчанию!!!");
    }

    public Person(String name, int age) {
        this(12);

        this.age = age;
        this.name = name;
    }

    public Person(String surname, String name) {
        this.name = name;
        this.surname = surname;
        System.out.println("конструктор с двумя полями - имя и фамилия!!!");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("конструктор с одним полем - имя!!!");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, nationality);
    }
}
