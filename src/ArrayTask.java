import java.sql.SQLOutput;

public class ArrayTask {

    public static void main(String[] args) {

        int[] numbers =  new int[10];
        for (int i = 0; i < numbers.length; i++) {
                numbers[i] =i + 1;
        }

        System.out.println("===============");
        System.out.println("Array with numbers: ");

        for (int number : numbers) {
            System.out.println(number + " ");

        }

        System.out.println("===============");
        System.out.println("Sum of numbers in array: ");

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);

        System.out.println("===============");
        System.out.println("Largest number in array: ");





    }
}
