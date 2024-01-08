package lesson3;

public class SwitchStatement {

    public static void main(String[] args) {
        // if
        // if else
        // if else if

        int size = 50;

        if (size > 48) {
            System.out.println("> M");
        }
        // -------------------------------------------
        if (size > 48 && true) {
            System.out.println("> M");
        } else {
            System.out.println("<= M");
        }
        // -------------------------------------------
        if (size > 48 && true) {
            System.out.println("> M");
        } else  if (size > 56){
            System.out.println("<= xll");
        }

        int age = 12;
        switch (age){
            case 12:
                System.out.println("12");

            case 212:
                System.out.println("12");

            case 3452:
                System.out.println("12");
                break;
            default:
                System.out.println("");
        }

    }





}

