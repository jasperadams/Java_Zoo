
public class Giraffe extends Animal{

    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        if (food.equals(this.favoriteFood)) {
            super.eat(food);
        } else {
            System.out.println("YUCK!!! " + this.Name + " will not eat " + food);
        }
    }

}
