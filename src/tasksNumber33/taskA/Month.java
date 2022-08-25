package tasksNumber33.taskA;

/*
        **Задача A.**

        - Создать энам для месяцев года YearMonth
        - Заполнить случайными значениями из енамки YearMonth
        - Массив
        - LinkedList
        - ArrayList
        - Написать перегруженные (overload) методы для того, чтобы вернуть отсортированные
        * списки (Массивы, ArrayList и LinkedList) – сначала 0 в конце 1.
 */

public class Month {
    private YearMonth yearMonth;
    private int choiceYearMonth;

    public YearMonth getYearMonth() {
        return yearMonth;
    }

    public Month(int choiceYearMonth) {
        this.choiceYearMonth = choiceYearMonth;
        switch (choiceYearMonth) {
            case 1 -> this.yearMonth = YearMonth.JANUARY;
            case 2 -> this.yearMonth = YearMonth.FEBRUARY;
            case 3 -> this.yearMonth = YearMonth.MARCH;
            case 4 -> this.yearMonth = YearMonth.APRIL;
            case 5 -> this.yearMonth = YearMonth.MAY;
            case 6 -> this.yearMonth = YearMonth.JUNE;
            case 7 -> this.yearMonth = YearMonth.JULY;
            case 8 -> this.yearMonth = YearMonth.AUGUST;
            case 9 -> this.yearMonth = YearMonth.SEPTEMBER;
            case 10 -> this.yearMonth = YearMonth.OCTOBER;
            case 11 -> this.yearMonth = YearMonth.NOVEMBER;
            case 12 -> this.yearMonth = YearMonth.DECEMBER;
        }
    }

    @Override
    public String toString() {
        return yearMonth.getMonthInRussia();
    }
}
