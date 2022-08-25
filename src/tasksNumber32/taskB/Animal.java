package tasksNumber32.taskB;

/*
        **Задача Б. Работа с листами**

        1. Создать по 50 кошек и собак, с возрастом, идущим на увеличение

        1. Сохранить всех кошек и собак в LinkedList

        1. Удалить из списка каждую 5 кошку

        1. Вставить после каждой 3 собаки – одну мышку.

        1. Найти оказавшихся рядом кошек и мышек, переместить их в новый LinkedList.

        1. Скопировать весь список из пункта 4 в ArrayList.

        1. Получить сумму возрастов отдельно по мышкам, кошкам и собакам.

        1. Нужно распределить элементы в новый LinkedList так, чтобы в посередине были собаки, вначале кошки,
            а в хвосте мыши (чтобы не было конфликта мышей и кошек).
 */

public class Animal {
    private int age;
    private String name;
    private String type;

    public Animal() {
    }

    public Animal(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Возраст = " + age + " | Имя = " + name + " | Тип = " + type + "\n";
    }
}

