import java.util.InputMismatchException;
import java.util.Scanner;

public class Dionisio_MachineLearning1 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        String divider = "=======================================";

        while (true) {
            System.out.println(divider);
            System.out.println("1. Sum of a digit");
            System.out.println("2. Reverse a number");
            System.out.println("3. Display all the prime numbers from 2 to a given number");
            System.out.println("4. Check for palindrome");
            System.out.println("5. Check if a number is odd or even");
            System.out.println("6. Exit");
            System.out.print("Enter option [1-6]: ");
            choice = userInput.nextInt();
            System.out.println(divider);

            try {
                switch (choice) {
                    case 1 -> System.out.println("The sum is: " + sumOfDigit(intInput()));
                    case 2 -> System.out.println("The reversed number is: " + reverseInput(String.valueOf(intInput())));
                    case 3 -> displayPrimeNumbers(intInput());
                    case 4 -> isPalindrome(stringInput());
                    case 5 -> isEvenNumber(intInput());
                    case 6 -> {
                        System.out.println("Shutting Down... (Zion Nathan Dionisio)");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid Input");
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid input");
                userInput.next();
            }
        }
    }

    public static int intInput() {
        System.out.print("Enter a number: ");
        return userInput.nextInt();
    }

    public static String stringInput() {
        System.out.print("Enter a word/number: ");
        return userInput.next();
    }

    public static int sumOfDigit(int digit) {
        return sumOfArrayValues(arrayStringToInt(separateCharacters((Integer.toString(digit)))));
    }

    public static int sumOfArrayValues(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    public static int[] arrayStringToInt(String[] stringArray) {
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    public static String[] separateCharacters(String input) {
        String[] characters = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            characters[i] = String.valueOf(input.charAt(i));
        }
        return characters;
    }

    public static String reverseInput(String input) {
        String[] digitArray = (separateCharacters(input));
        String[] reversedArray = new String[digitArray.length];

        for (int i = 0, j = digitArray.length - 1; i < digitArray.length; i++, j--) {
            reversedArray[i] = digitArray[j];
        }
        return combineArray(reversedArray);
    }

    public static String combineArray(String[] input) {
        StringBuilder newWord = new StringBuilder();
        for (String s : input) {
            newWord.append(s);
        }
        return String.valueOf(newWord);
    }

    public static void displayPrimeNumbers(int end) {
        boolean[] prime = new boolean[end + 1];
        for (int i = 0; i <= end; i++)
            prime[i] = true;

        for (int j = 2; j * j <= end; j++) {
            if (prime[j]) {
                for (int i = j * j; i <= end; i += j)
                    prime[i] = false;
            }
        }

        System.out.printf("The prime numbers between 2 and %d are:\n", end);
        for (int i = 2; i <= end; i++) {
            if (prime[i])
                System.out.print(i + " ");
            if ((i - 1) % 100 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void isPalindrome(String input) {
        String reverse = reverseInput(input);
        if (input.equals(reverse)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static void isEvenNumber(int digit) {
        if (digit % 2 == 0) {
            System.out.println(digit + " is an even number.");
        } else {
            System.out.println(digit + " is an odd number.");
        }
    }
}
