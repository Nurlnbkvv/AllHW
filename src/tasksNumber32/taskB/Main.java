package tasksNumber32.taskB;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animalsForWork = new LinkedList<>();
        LinkedList<Animal> animalsFinalResult = new LinkedList<>();
        LinkedList<Animal> catAndMouse = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            animalsForWork.add(new Animal(i, "Cat" + i, "cat"));
        }
        for (int i = 1; i <= 50; i++) {
            animalsForWork.add(new Animal(i, "Dog" + i, "dog"));
        }

        System.out.println("--------------------------------------");
        System.out.println("Список после создания животных");
        SoutForList(animalsForWork);
        deleteFivesCat(animalsForWork);

        System.out.println("--------------------------------------");
        System.out.println("Список после удаления");
        SoutForList(animalsForWork);
        addMouse(animalsForWork);

        System.out.println("--------------------------------------");
        System.out.println("Список после добавления мышек");
        SoutForList(animalsForWork);

        getNeighborCatAndMouse(animalsForWork, catAndMouse);
        sumAnimals(animalsForWork);

        System.out.println("--------------------------------------");
        System.out.println("Конечный общий список");
        SoutForList(animalsForWork);

        animalsFinalResult = DistributionAnimal(animalsForWork);
        System.out.println("--------------------------------------");
        System.out.println("Конечный список только с кошками и мышками рядом");
        SoutForList(animalsFinalResult);

    }

    public static void SoutForList(LinkedList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }


    public static void deleteFivesCat(LinkedList<Animal> animals) {
        LinkedList<Animal> deletableAnimals = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            Animal cat = animals.get(i);
            if (animals.get(i).getAge() % 5 == 0 && animals.get(i).getType().equals("cat")) {
                deletableAnimals.add(animals.get(i));
            }
        }
        animals.removeAll(deletableAnimals);
    }

    public static void addMouse(LinkedList<Animal> animals) {
        int mouse = 1;
        for (int i = 0; i < animals.size(); i++) {
            Animal dog = animals.get(i);
            if (dog.getAge() % 3 == 0 && dog.getType().equals("dog")) {
                animals.add(i + 1, new Animal(mouse, "mouse" + mouse, "mouse"));
                mouse++;
            }
        }
    }

    public static void getNeighborCatAndMouse(LinkedList<Animal> animals, LinkedList<Animal> catAndMouse) {
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i).getType().equals("cat")) {
                if (animals.get(i + 1).getType().equals("mouse")) {
                    catAndMouse.add(animals.get(i));
                    catAndMouse.add(animals.get(i + 1));
                } else if (animals.get(i - 1).getType().equals("mouse")) {
                    catAndMouse.add(animals.get(i));
                    catAndMouse.add(animals.get(i - 1));
                }
            } else if (animals.get(i).getType().equals("mouse")) {
                if (animals.get(i + 1).getType().equals("cat")) {
                    catAndMouse.add(animals.get(i));
                    catAndMouse.add(animals.get(i + 1));
                } else if (animals.get(i - 1).getType().equals("cat")) {
                    catAndMouse.add(animals.get(i));
                    catAndMouse.add(animals.get(i - 1));
                }
            }
        }
    }

    public static void sumAnimals(LinkedList<Animal> animals) {
        int counterCat = 0;
        int counterDog = 0;
        int counterMouse = 0;
        int sumCat = 0;
        int sumDog = 0;
        int sumMouse = 0;
        for (Animal animal : animals) {
            if (animal.getType().equals("cat")) {
                counterCat++;
            } else if (animal.getType().equals("dog")) {
                counterDog++;
            } else if (animal.getType().equals("mouse")) {
                counterMouse++;
            }
            sumCat = sumCat + counterCat;
            sumDog = sumDog + counterDog;
            sumMouse = sumMouse + counterMouse;
        }
        System.out.println("--------------------------------------");
        System.out.println("Сумма всех котов равна: " + sumCat);
        System.out.println("Сумма всех собак равна: " + sumDog);
        System.out.println("Сумма всех мышей равна: " + sumMouse);
    }

    public static LinkedList<Animal> DistributionAnimal(LinkedList<Animal> animalsForWork) {
        LinkedList<Animal> temporaryLinkedList = new LinkedList<>();
        for (Animal animal : animalsForWork) {
            if ("cat".equals(animal.getType())) {
                temporaryLinkedList.add(animal);
            }
        }
        for (Animal animal : animalsForWork) {
            if ("dog".equals(animal.getType())) {
                temporaryLinkedList.add(animal);
            }
        }
        for (Animal animal : animalsForWork) {
            if ("mouse".equals(animal.getType())) {
                temporaryLinkedList.add(animal);
            }
        }
        return temporaryLinkedList;
    }
}
