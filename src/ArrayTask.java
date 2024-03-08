import java.sql.SQLOutput;

public class ArrayTask {

    public static void main(String[] args) {

        int[] numbers =  new int[10];
        for (int i = 0; i < numbers.length; i++) {
                numbers[i] =i + 1;
        }

        System.out.println("===============");
        System.out.println("1. Array with numbers: ");

        for (int number : numbers) {
            System.out.println(number + " ");
        }

        System.out.println("===============");
        System.out.println("2. Sum of numbers in array: ");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);

        System.out.println("===============");
        System.out.println("3. Largest number in array: ");

        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
             }

        System.out.println(maxNumber);
        }
    }
}