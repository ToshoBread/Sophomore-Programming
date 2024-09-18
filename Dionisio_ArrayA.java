import java.util.Scanner;
import java.util.Arrays;

public class Dionisio_ArrayA {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        String divider = "=======================================";

        while (true){
            System.out.println(divider);
            System.out.println("1. Sum of N number in an array");
            System.out.println("2. Maximum and Minimum number");
            System.out.println("3. Distinct Number");
            System.out.println("4. Exit");
            System.out.print("Enter option [1-4]: ");
            choice = userInput.nextInt();
            System.out.println(divider);

            switch (choice) {
                case 1 -> sumOfArrayValues(initializeArray());
                case 2 -> findArrayMaxMin(initializeArray());
                case 3 -> deleteDuplicateArrayValues(initializeArray());
                case 4 -> {
                    System.out.println("Shutting Down...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input");
            }
        }
    }
    public static int[] initializeArray(){
        System.out.print("Enter array size: ");
        int arraySize = userInput.nextInt();
        int[] nums = new int[arraySize];

        for (int i = 0; i < nums.length; i++){
            System.out.printf("Enter element %d: ", i + 1);
            int numInput = userInput.nextInt();

            nums[i] = numInput;
        }
        return nums;
    }

    public static void sumOfArrayValues(int[] nums){
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println("The sum of all values is: " + sum);
    }

    public static void findArrayMaxMin(int[] nums){
        int min = nums[0];
        int max = 0;

        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        System.out.printf("The Maximum value is: %d\n", max);
        System.out.printf("The Minimum value is: %d\n", min);
    }

    public static void deleteDuplicateArrayValues(int[] nums){
        int[] sortedNums = sortArray(nums);
        int bounds = nums.length;
        int[] temp = new int[bounds];
        int distinctValues = 0;

        for (int i = 0; i < bounds - 1; i++){
            if (sortedNums[i] != sortedNums[i + 1]){
                temp[distinctValues++] = sortedNums[i];
            }
        }
        temp[distinctValues++] = sortedNums[bounds - 1];

        int[] newArr = Arrays.copyOf(temp, distinctValues);
        System.out.println("The distinct values are: " + Arrays.toString(newArr));
    }

    public static int[] sortArray(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
