package tasksNumber50;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class DayOfWeek {
    public static void main(String[] args) {

        Map<java.time.DayOfWeek, Integer> map = new LinkedHashMap<>();
        map.put(java.time.DayOfWeek.MONDAY, 0);
        map.put(java.time.DayOfWeek.TUESDAY, 0);
        map.put(java.time.DayOfWeek.WEDNESDAY, 0);
        map.put(java.time.DayOfWeek.THURSDAY, 0);
        map.put(java.time.DayOfWeek.FRIDAY, 0);
        map.put(java.time.DayOfWeek.SATURDAY, 0);
        map.put(java.time.DayOfWeek.SUNDAY, 0);

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            LocalDate date = LocalDate.ofYearDay(2022, random.nextInt(365) + 1);
            map.put(date.getDayOfWeek(), map.get(date.getDayOfWeek()) + 1);
            System.out.println("Выбран " + date + ", это " + date.getDayOfWeek().name() + " + 1");
        }
        System.out.println(map);
    }
}