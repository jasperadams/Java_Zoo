
public class Animal {
    String Name;
    String favoriteFood;

    public Animal(String name, String food) {
        this.Name = name;
        this.favoriteFood = food;
        population += 1;
    }

    public void sleep() {
        System.out.println(this.Name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.Name + " eats " + food);
        if (food.equals(this.favoriteFood)) {
            System.out.println("YUM!!! " + this.Name + " wants more " + this.favoriteFood);
        } else {
            sleep();
        }
    }

    static int population = 0;

    public static int populationCount() {
        return population;
    }
}
