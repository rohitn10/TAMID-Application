import java.util.Arrays;

public class Challenge1 {
    public static void sortArrays(int[] arr1, int[] arr2, int k)
    {
        // Initialization of the result array
        int[] result = new int[k];
        // Initialization of variables
        int i = 0, j = 0, index = 0;

        // Traversing through both arrays to get the first k sorted values
        while (index < k && i < arr1.length && j < arr2.length) {
            // If the value in the first array is smaller than the second, add it to the result array
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                i++; // Increment the index position of the first array
            }
            // If the value in the second array is smaller than the first, add it to the result array
            else {
                result[index] = arr2[j];
                j++; // Increment the index position of the second array
            }
            index++; // Increment the index position of the result array after adding a value
        }
        // If first array is not exhausted, fill the remaining elements from it
        while (index < k && i < arr1.length) {
            result[index] = arr1[i];
            i++;
            index++;
        }
        // If second array is not exhausted, fill the remaining elements from it
        while (index < k && j < arr2.length) {
            result[index] = arr2[j];
            j++;
            index++;
        }

        // Displays the result array
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8};
        int[] arr2 = {1, 2, 3};
        int k = 5;
        sortArrays(arr1, arr2, k);
    }
}