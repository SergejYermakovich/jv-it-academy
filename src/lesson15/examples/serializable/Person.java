package lesson15.examples.serializable;

import java.io.Serializable;

class Person {

    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                '}';
    }
}