package Array;
//Write a Java program to sum values of an array
public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
