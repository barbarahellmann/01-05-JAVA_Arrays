public class Main {
    public static void main(String[] args) {

        // [] -> Array
        int[] numbers = {5, 10, 4};

        int sum = numbers[1] + numbers[0];
        System.out.println(sum);
        numbers[2] = 5;

        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 4;
        nums[3] = 20;

        printNumbers(nums);
    }

    public static void printNumbers(int[] currywurst) {

        //Zähler;       Läuft solange x;     Mache nach jedem Durchlauf
        for (int i = 0; i<currywurst.length; i++){
            System.out.println(currywurst[i]);
        }

        System.out.println("=====================");

        //Erstelle ein x für jeden Eintrag in : Datensammlung
        for (int num : currywurst) {
            System.out.println(num);
        }

    }
}