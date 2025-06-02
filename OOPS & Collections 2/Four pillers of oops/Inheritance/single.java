package Inheritance;

class Demo1{
    public void disp1(){
        System.out.println("This is parent class");
    }
}

class Demo2 extends  Demo1{
    public void disp2(){
        System.out.println("This is child class");
    }
}
public class single {
    public static void main(String[] args) {
     Demo2 d2 =new Demo2();
        d2.disp1();
        d2.disp2();
    }
}
