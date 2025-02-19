package gr.aueb.cf.ch15.challenges;

public class Animal {

    public String name;

    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("I am an animal.");
    }

    @Override
    public String toString() {
        return "Animal name: " + name + ", age: " + age;
    }
}
