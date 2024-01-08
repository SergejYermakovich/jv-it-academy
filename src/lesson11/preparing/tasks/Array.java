package lesson11.preparing.tasks;

public class Array <T> {
    private T [] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (T element: array) {
            System.out.print(element + " ");
        }
    }
}
