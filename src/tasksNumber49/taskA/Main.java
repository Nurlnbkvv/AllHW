package tasksNumber49.taskA;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car("Audi", "RS7", 2022, 10300000));
        cars.put(2, new Car("RangeRover", "Vogue SE", 2017, 9714000));
        cars.put(3, new Car("BMW", "8", 2022, 12560000));

        for (Integer car : cars.keySet()) {
            System.out.println(cars.get(car));
        }
    }
}

        /*Задача A.

        Заполнить HashMap данными всех автомобилей.

        · Ключ – ID автомобиля

        · Значение – Объект Автомобиля

        · Пройтись по всем элементам таблицы. Вывести в консоль. */