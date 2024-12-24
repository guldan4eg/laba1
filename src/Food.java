import java.util.Arrays;

public abstract class Food implements Consumable, Nutricious {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) {
            return false;
        }
        return name.equals(((Food) arg0).name);
    }

    public static int totalCalories(Food[] foods) {
        int totalCalories = 0;
        for (Food food : foods) {
            totalCalories += food.calculateCalories();
        }
        return totalCalories;
    }

    public static void processCommand(Food[] foods, String command) {
        if (command.equals("-calories")) {
            System.out.println("Общая калорийность завтрака: " + totalCalories(foods));
        } else if (command.equals("-sort")) {
            Arrays.sort(foods, new FoodComparator());
            System.out.println("Сортировка продуктов:");
            for (Food food : foods) {
                System.out.println(food);
            }
        }
    }

}
