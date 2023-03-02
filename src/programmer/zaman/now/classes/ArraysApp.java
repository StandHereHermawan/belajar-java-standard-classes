package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1,4,234,23,4,5,3,5,53,6,7,5,3,5,7,53,5,7,2,34,3,5,6,7,9,4,3,5,8,7,5,7,3,7,4,5,6,8,77,5,
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 234));
        System.out.println(Arrays.binarySearch(numbers, 235));

        int[] result = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,6,16);
        System.out.println(Arrays.toString(result2));

    }
}
