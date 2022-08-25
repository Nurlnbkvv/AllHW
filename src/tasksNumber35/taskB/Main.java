package tasksNumber35.taskB;

/*
        Задача Б. Работа с листами

        · Создайте ArrayList

        · Заполните случайными числами от 1 до 100 (50 чисел)

        · Разделите по разным листам, в один четные числа, в другой нечетные числа

        · Выведите в консоль
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<>();
        ArrayList<Integer> arrayNot2 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrays.add(random.nextInt(1, 101));
        }

        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) % 2 != 0) {
                arrayNot2.add(arrays.get(i));
            }
            else if (array2.add(arrays.get(i)));
        }
        System.out.println(array2);
        System.out.println(arrayNot2);
    }
}