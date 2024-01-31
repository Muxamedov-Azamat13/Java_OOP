package main.clients;


public class Eagle extends Animal {
    @Override
    public void toGo() {
        System.out.println("An eagle can walk!");
    }

    @Override
    public void fly() {
        System.out.println("Eagles can fly!");
    }

    @Override
    public void swim() {
        System.out.println("Eagles can't swim!");
    }


}
