package Recursion;

public class Recursion {
    static int cut = 0;
    static void f(){
if(cut == 4){
    return;
}
        System.out.println(cut);
        cut++;
        f();
    }

    public static void main(String[] args) {
        f();
    }
}
