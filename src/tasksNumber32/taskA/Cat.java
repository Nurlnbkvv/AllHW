package tasksNumber32.taskA;

        /*
        **Задача A.Работа с листами**

        - Создать списки ArrayList и LinkedList из 1000000 кошек.
        - Добавить 100 кошек в середину списков – сделать замер времени (например LocalDateTime.now() или System.currentTimeMillis) – у кого быстрее.
        - Добавить 100 в начало, конец – замерить.
        - Считать (get) с середины, с конца – замерить
        - Удалить в середине и начале – замерить
        - В конце вывести статистику, сравнение, где было быстрее
         */

public class Cat {
    private CatName catName;
    private int chooseName;

    public Cat(int chooseName) {
        this.chooseName = chooseName;
        if(chooseName == 1) {
            this.catName = CatName.RYJIK;
        }
        else if(chooseName == 2) {
            this.catName = CatName.TOM;
        }
        else if(chooseName == 3) {
            this.catName = CatName.BOBIK;
        }
    }
}
