import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Shuffle the array
        shuffleArray(array);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        // Start from the last element and swap one by one
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap array[i] with the element at randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
