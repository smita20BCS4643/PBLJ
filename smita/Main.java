package smita;

class Animal {  
    private String name;  
    private int age;  

    public Animal(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    public void eat() {  
        System.out.println("The animal is eating.");  
    }  

    public void sleep() {  
        System.out.println("The animal is sleeping.");  
    }  
}  

class Dog extends Animal {  
    public Dog(String name, int age) {  
        super(name, age);  
    }  

    public void bark() {  
        System.out.println("The dog is barking.");  
    }  
}  

public class Main {  
    public static void main(String[] args) {  
        Dog dog = new Dog("Buddy", 3);  
        dog.eat();  
        dog.sleep();  
        dog.bark();  
    }  
}
