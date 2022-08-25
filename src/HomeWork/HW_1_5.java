package HomeWork;

import javax.swing.*;
import java.util.Scanner;

/* ## 1. Четное-нечетное.

1. Передать на вход программы число в качестве аргумента.
2. Если оно нечетное, распечатать его.
3. Используем оператор if.
 */

public class HW_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста полажительное число: ");
        int a;
        a = scanner.nextInt();
        AddArgument(a);

    }
    public static void AddArgument(int a) {
        if ((a % 2) == 0){
            System.out.println("Число " + a + " четное");
        }
        else {
            System.out.println("Число " + a + " нечетное");
        }
    }
}

/* ## 2. Число от 0 до 10.

        1. С помощью класса Scanner ввести целое число.
        2. Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”, иначе вывести сообщение “Положительное число больше 10 или
        отрицательное”.
        3. Используем оператор if-else.
 */

class HW_1_5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста целое число: ");
        int n = scanner.nextInt();
        if (n >= 10) {
            System.out.println("Положительное число больше 10");
        }
        else if (n < 10 && n >= 0) {
            System.out.println("Положительное число меньше 10");
        }
        else {
            System.out.println("Ваше чисо отрицательное");
        }
    }
}

/* ## 3. Четное-нечетное c if-else-if.

1. Передать на вход программы число От 1 до 7 в качестве аргумента.
2. Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так
далее. Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if.
 */

class HW_1_5C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 7: ");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Понедельник");
        } else if (number == 2){
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        }else if (number == 4) {
            System.out.println("Четверг");
        }else if (number == 5) {
            System.out.println("Пятница");
        }else if (number == 6 || number == 7) {
            System.out.println("Выходной");
        }
    }
}
