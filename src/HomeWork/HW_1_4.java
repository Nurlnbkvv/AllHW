package HomeWork;

import java.util.Scanner;

/* **Задача А. Треугольник?**
Даны три меры угла в градусах, требуется определить – могут ли эти три угла являться углами одного треугольника
 */

public class HW_1_4 {
    public static void main(String[] args) {
        int a, b, c, sum;
        System.out.println("Введите градусы углов триугольника: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        sum = a + b +c;
        if (a > 0 && b > 0 && c > 0 & sum == 180) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

/* **Задача B Проверка кратности числа**

 Дано число N и число A, нужно написать программу, которая будет выводить нам делится ли N на A без остатка
 */

    class HW_1_4B {
        public static void main(String[] args) {
            int Answer, a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            Answer = a % b;
            if (Answer == 0) {
                System.out.println("Да");
            }else {
                System.out.println("Нет");
            }

        }
}