package tasksNumber34.taskA;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            dogs.add(new Dog(random.nextInt(1,5000),random.nextInt(1,10)));
        }
        for (Dog dog: dogs) {
            int a = 1;
            System.out.print(a+")");
            dog.Speak();
            a++;
        }
    }
}
