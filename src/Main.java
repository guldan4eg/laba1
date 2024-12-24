public class Main {
    public static void main(String[] args) {
        Food[] breakfast = {
                new Burger(Burger.Size.SMALL),
                new Burger(Burger.Size.LARGE),
                new Burger(Burger.Size.MEDIUM)
        };

        Food.processCommand(breakfast, "-calories");
        Food.processCommand(breakfast, "-sort");
        Food.totalCalories(breakfast);
    }
}
