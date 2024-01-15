import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int[] intArray;
    private int n;

    public Array(int size) {
        n = size;
        intArray = new int[n];
    }

    public void enter() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
    }

    public void print() {
        for (int currentValue : intArray)
            System.out.print(currentValue + " ");
        System.out.println();
    }

    public void sort() {
        Arrays.sort(intArray);
    }
}