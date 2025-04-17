//Instance variable

package smita;

class InstanceVariableDemo {  
    // Defining Instance Variables  
    public String name;  
    public int age = 19;  

    // Default Constructor initializing Instance Variable  
    public InstanceVariableDemo() {  
        this.name = "Deepak";  
    }  
}  

public class B2_VariableTypes {  
    public static void main(String[] args) {  
        // Object Creation  
        InstanceVariableDemo obj = new InstanceVariableDemo();  
        System.out.println("Student Name is: " + obj.name);  
        System.out.println("Age: " + obj.age);  
    }  
}
