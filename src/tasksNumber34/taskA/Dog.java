package tasksNumber34.taskA;

/*
        Задача A.Работа с Set
        - Создать Класс Собака
        - Добавить в Set 40 Далматинцев
        - Не допускать добавления одинаковых далматицев (имя и вес отличаются).
        - Сделать так чтобы далматинцы рассказали о себе.
 */

public class Dog {
    private int weight;
    private int age;

    public Dog(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Speak(){
        System.out.println("Привет я Далматинец, мне "+age+", мой вес "+weight+", Пока!");
    }
}