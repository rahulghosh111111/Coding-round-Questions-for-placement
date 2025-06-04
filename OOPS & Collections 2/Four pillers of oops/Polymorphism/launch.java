package Polymorphism;
// Polymorphism is the ability of a single function to operate on different types of objects.
// Polymorphism is a feature of OOPs that allows objects of different classes to be treated as objects of a common superclass.

class Parent{
    public void cry(){
        System.out.println("Parent does not crying");
    }
}
class Child1 extends Parent{
    public void cry(){
        System.out.println("Child1 cries with low voice");
    }
}
class Child2 extends Parent{
    public void cry(){
        System.out.println("Child2 cries with moderate voice");
    }
}
class Child3 extends Parent{
    public void cry(){
        System.out.println("Child3 cries with high voice");
    }
}
public class launch {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.cry(); // Parent class method
       
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        Parent ref;   // reference of parent class but object of child classes
        ref = c1;    // ref is pointing to c1 object
        ref.cry();  // Overriding method
        ref = c2;
        ref.cry();
        ref = c3;
        ref.cry();
    }
}
