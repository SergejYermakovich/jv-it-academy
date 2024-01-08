package lesson4;

public class ForEach {
    public static void main(String[] args) {


        int[] grades = {6, 4, 6, 5, 7, 8, 9};

        // for each
        for (int grade : grades) {
            System.out.println(grade);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);

        }


    }
}
