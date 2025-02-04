package gr.aueb.cf.ch16.abstract_class;

public class Cat extends Animal {

    public Cat() {

    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all ïts food");
    }
}
