package tasksNumber32.taskA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        LinkedList<Cat> linkedList = new LinkedList<>();
        ArrayList<Cat> arrayList = new ArrayList<>();
        AddCatInLinkedList(linkedList);
        AddCatInArrayList(arrayList);
        AddCatInLinkedListMiddle(linkedList);
        AddCatInArrayListInMiddle(arrayList);
        AddCatInLinkedListBeginningEnd(linkedList);
        AddCatInArrayListBeginningEnd(arrayList);
        GetCatInLinkedListInMiddleEnd(linkedList);
        GetCatInArrayListInMiddleEnd(arrayList);
        RemoveCatInLinkedListInMiddleBegging(linkedList);
        RemoveCatInArrayListInMiddleBegging(arrayList);

    }

    private static void GetCatInLinkedListInMiddleEnd(LinkedList<Cat> linkedList) {
        long start = System.currentTimeMillis();
        linkedList.get(linkedList.size()/2);
        linkedList.getLast();
        System.out.println("Время получения данных с середины и конца в LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }

    private static void GetCatInArrayListInMiddleEnd(ArrayList<Cat> arrayList) {
        long start = System.currentTimeMillis();
        arrayList.get(arrayList.size()/2);
        arrayList.get(arrayList.size()-1);
        System.out.println("Время получения данных с середины и конца в ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }
    private static void RemoveCatInLinkedListInMiddleBegging(LinkedList<Cat> linkedList) {
        long start = System.currentTimeMillis();
        linkedList.remove(linkedList.size()/2);
        linkedList.removeFirst();
        System.out.println("Время удаления данных с середины и начала в LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }

    private static void RemoveCatInArrayListInMiddleBegging(ArrayList<Cat> arrayList) {
        long start = System.currentTimeMillis();
        arrayList.remove(arrayList.size()/2);
        arrayList.remove(0);
        System.out.println("Время удаления данных с середины и начала в ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }


    private static void AddCatInLinkedListMiddle(List<Cat> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(linkedList.size() / 2, new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в середину LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }

    private static void AddCatInLinkedListBeginningEnd(LinkedList<Cat> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.addFirst(new Cat(random.nextInt(1, 4)));
        }
        for (int i = 0; i < 100; i++) {
            linkedList.addLast(new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в начало и конец LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }

    private static void AddCatInArrayListInMiddle(List<Cat> arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(arrayList.size() / 2, new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в середину ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }
    private static void AddCatInArrayListBeginningEnd(ArrayList<Cat> arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(0,new Cat(random.nextInt(1, 4)));
        }
        for (int i = 0; i < 100; i++) {
            arrayList.add(arrayList.size(), new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в начало и конец ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }

    private static void AddCatInArrayList(List<Cat> arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }

    private static void AddCatInLinkedList(List<Cat> linkedList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(new Cat(random.nextInt(1, 4)));
        }
        System.out.println("Время добавления объекта в LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));
    }
}