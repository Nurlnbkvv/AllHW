package tasksNumber32.taskA;

public enum CatName {
    RYJIK("Рыжик"),
    TOM("Том"),
    BOBIK("Бобик");

    private String name;

    CatName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

