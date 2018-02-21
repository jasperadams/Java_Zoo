
public class Tiger {

    String Name;
    String favoriteFood;

    public Tiger(String name) {
        this.Name = name;
        this.favoriteFood = "meat";
    }

    public void sleep() {
        System.out.println(this.Name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.Name + " eats " + food);
        if (food.equals(this.favoriteFood)) {
            System.out.println("YUM!!! " + this.Name + " wants more bacon");
        } else {
            sleep();
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
