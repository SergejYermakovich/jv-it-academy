package test;

public abstract class Animal {

    public Animal() {
        System.out.println("Animal constuctor....");
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;

        System.out.println("Animal constuctor: name+age....");
    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
