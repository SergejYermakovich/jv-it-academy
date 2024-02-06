package lesson18.preparing.tasks;

/*
 * 6. Разработайте программу для поиска наибольшего общего делителя двух чисел.
 * */
public class NodMain {
    public static void main(String[] args) {


        System.out.println(getNod(11, 121));

    }

    static int getNod(int a, int b) {
        int minNumber = Math.min(a, b);

        int nod = 1;
        for (int i = 1; i <= minNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
