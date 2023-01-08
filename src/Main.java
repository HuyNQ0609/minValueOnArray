//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {12, 4, 5, 7, 43, 23, 67, 45, 78, 48};
//        int index = minValue(arr);
//        System.out.println("The smallest element in the array is: " + arr[index]);
//    }
//
//    public static int minValue(int[] array) {
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] < array[index]) {
//                index = i;
//            }
//        }
//        return index;


//*-----------------------------------------||||||-----------------------------------------------*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        int index = minValue(array);
        System.out.printf("\nThe smallest element in the array is: " + array[index]);
    }
    public static int minValue(int[] arr) {
        int index = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < arr[index]) {
                index = k;
            }
        }
        return index;
    }
}