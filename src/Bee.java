
public class Bee extends Animal{

    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(this.Name + " never sleeps");
    }

    public void eat(String food) {
        if (food.equals(this.favoriteFood)) {
            super.eat(food);
        } else {
            System.out.println("YUCK!!! " + this.Name + " will not eat " + food);
        }
    }
}
