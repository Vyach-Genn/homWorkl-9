import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        String rub = " рублей";
        int[] salary = {26600, 29500, 31000, 29800, 30400};
        int sum = 0;
        for (int i : salary) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + rub);
        System.out.println();

        // Task 2

        System.out.println("Task 2");
        int[] salary1 = {26600, 29500, 31000, 29800, 30400};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : salary1) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min +
                " рублей. Максимальная сумма трат за неделю составила " + max + rub);
        System.out.println();

        // Task 3

        System.out.println("Task 3");

        int[] salary3 = {26600, 29500, 31000, 29800, 30400};
        sum = 0;
        for (int index : salary3) {
            sum += index;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / 4D + rub);
        System.out.println();

        // Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c]);
        }


    }
}