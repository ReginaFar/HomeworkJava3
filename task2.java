import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Задание 2:
 * Создать список целых чисел (заполнить случайными числами).
 * Найти минимальное, максимальное и среднее из этого списка.
 */

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            newList.add(random.nextInt(100));
        }
        System.out.println(newList);
        System.out.println("Максимальное значение в списке: " + Collections.max(newList));
        System.out.println("Минимальное значение в списке: " + Collections.min(newList));
        int sum = 0;
        for (int i = 0; i < newList.size(); i++) {
            sum += newList.get(i);
        }
        System.out.println("Среднее значение в списке: " + sum / newList.size());
    }
}