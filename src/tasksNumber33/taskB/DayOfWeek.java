package tasksNumber33.taskB;

/*
        **Задача B. Вопросы и Ответы**

        Ответьте на вопросы своими словами:

        1. Что такое Enum?
            Enum - это список однотипных значений
        1. Приведите 3 примера где можно было бы использовать Enum?
            Answer, DayOfWeek, Main
        1. Какие плюсы использования Enum вы знаете?
            Безопасность типа.
        1. Когда лучше использовать LinkedList, ArrayList и обычный Array?

        1. Напишите кодом любой пример из 2. Пункта используя switch case
 */

public enum DayOfWeek {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    DayOfWeek(String s){
        this.dayInRussian = s;
    }

    private String dayInRussian;

    public String getDayInRussian() {
        return dayInRussian;
    }
}