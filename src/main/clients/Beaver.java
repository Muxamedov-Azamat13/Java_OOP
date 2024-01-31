package main.clients;

public class Beaver extends Animal {
    @Override
    public void toGo() {
        System.out.println("Beavers can walk!");
    }

    @Override
    public void fly() {
        System.out.println("Beavers can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Beavers can swim!");
    }
}
