package test;

import domain.Ferret;

public class TestAnimal {

    public static void main(String[] args) {
        Ferret ferret = new Ferret("Agri");
        System.out.println(ferret);
        ferret.Animal();
        ferret.eat();
        ferret.hunt();
        ferret.play();
        ferret.sleep();
        ferret.speak();
        ferret.water();
    }
}
