package Array.JavaTPoint;

public class Example10 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 3, 6, 44, 2};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
