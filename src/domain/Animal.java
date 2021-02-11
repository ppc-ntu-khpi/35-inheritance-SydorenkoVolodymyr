package domain;

public class Animal {

   protected String name;

    protected int weight;

   protected int growth;

    public void Animal() {
        name="generic animal";
        weight=5;
        growth=10;
    }

    public void eat() {
        System.out.println("Animal is a Eating");
    }

    public void water() {
        System.out.println("Animal is a drinking");
    }

    public void speak() {
        System.out.println("Animal speaking");
    }

    public void sleep() {
        System.out.println("Animal sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + ", growth=" + growth + '}';
    }

    
}
