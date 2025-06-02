package Inheritance;
class Demo1{
    public void disp1(){
        System.out.println("This is parent class");
    }
}
class Demo2 extends Demo1{
    public void disp2(){
        System.out.println("This is parent class");
    }
}
class Demo3 extends Demo2{
    public void disp3(){
        System.out.println("This is parent class");
    }
}
public class multilevel {
    public static void main(String[] args) {
        Demo3 d3= new Demo3();
        
    d3.disp1();
    d3.disp2();
    d3.disp3();
    }
}

