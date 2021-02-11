package domain;

public class Ferret extends Predator {

    private String kind;

    public Ferret(String name, int weight, int growth, String kind) {
        this.growth=growth;
        this.kind=kind;
        this.name=name;
        this.weight=weight;
    }

    public Ferret() {
        this(10,"Ukraine", "Jack", 10);
    }

    public Ferret(String name) {
        this(10, "Ukraine", "Jack", 10);
    }

   

    public void play() {
        System.out.println("Ferret is playing");
    }

    @Override
    public void hunt() {
        System.out.println("Ferret hunting for a mouse"); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public void sleep() {
        System.out.println("Ferret is sleeping");
    }

    @Override
    public void speak() {
        System.out.println("Hrhrhr");
    }

    @Override
    public void water() {
        System.out.println("Ferret drink water");
    }

    @Override
    public void eat() {
     System.out.println("Ferret eating meet");
    }

    @Override
    public void Animal() {
     System.out.println("Animal is a life!!!");
    }
    
}
