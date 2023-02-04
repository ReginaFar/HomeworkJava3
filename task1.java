import java.util.ArrayList;
import java.util.Random;

/**
 * Задание 1.
 * Создать список целых чисел (заполнить случайными числами), удалить из списка
 * четные числа.
 */

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            myList.add(random.nextInt(100));
        }
        System.out.println(myList);
        myList.removeIf(num -> num % 2 == 0);
        System.out.println(myList);
    }
}