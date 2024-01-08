package lesson4;


import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

//        String menu = "1) -----" +
//                   "2)......" +
//                   "3)выйти";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(menu);
//        int choice = scanner.nextInt();
//
//        while (true){
//            System.out.println(menu);
//            choice = scanner.nextInt();
//            if (choice == 3) break;
//        }

        Scanner scanner = new Scanner(System.in);

        while (true){
            int choice = scanner.nextInt();
            if (choice < 0) break;
        }

    }
}
