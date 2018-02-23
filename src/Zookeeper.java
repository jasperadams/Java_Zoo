import java.util.ArrayList;

public class Zookeeper {

    String Name;

    public Zookeeper(String name) {
        this.Name = name;
    }

    public void feedAnimals(ArrayList Animals, String food) {
        System.out.println(this.Name + " is feeding " + food + " to " + Animals.size() + " of " + Animal.populationCount() + " total animals");

    }

}
