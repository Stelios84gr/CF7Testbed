package gr.aueb.cf.ch15.challenges;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog.");
    }

    @Override
    public String toString() {
        return "Dog name: " + name + ", age: " + age;
    }
}
