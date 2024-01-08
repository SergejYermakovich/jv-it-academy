package test;

public class Dog extends Animal {

    private String country;
    public Dog() {
        super(12, "Tuzik");
        System.out.println("Dog constuctor....");
    }

    public Dog(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
