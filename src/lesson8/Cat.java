package lesson8;

import java.util.Objects;

public class Cat {
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    public Cat setAge(int age) {
        this.age = age;
        System.out.println(this);
        return this;
    }


    public Cat setColor(String color) {
        this.color = color;
        System.out.println(this);
        return this;
    }



    @Override
    public String toString() {
        return "Cat: " +
                "age=" + age +
                ", color='" + color + '\'' +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(color, cat.color);
    }

}
