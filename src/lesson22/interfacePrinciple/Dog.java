package lesson22.interfacePrinciple;

public class Dog implements SimpleJump, DogJump {
    @Override
    public void doSimpleJump() {
        System.out.println("doSimpleJump by dog");
    }


    @Override
    public void doSimpleDogJump() {
        System.out.println("doSimpleDogJump by dog");
    }

    @Override
    public void doHardDogJump() {
        System.out.println("doHardDogJump by dog");
    }

    @Override
    public void doMediumDogJump() {
        System.out.println("doMediumDogJump by dog");
    }
}
