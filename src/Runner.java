import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        tigger.eat("meat");
        pooh.eat("fish");
        pooh.eat("meat");
        rarity.eat("marshmallows");
        rarity.sleep();
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        stinger.eat("ice cream");
        stinger.eat("pollen");
        stinger.sleep();
        //part vi
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(tigger);
        list.add(pooh);
        list.add(rarity);
        list.add(gemma);
        list.add(stinger);
        zoebot.feedAnimals(list,"burgers");
    }
}
