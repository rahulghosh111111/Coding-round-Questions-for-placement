package Encapsulation;
// Encapsulation is the bundling of data with the methods that operate on that data.
class Book{
    private int page_no;
    public void setData(int x){
        if(x>0){
            page_no = x;
        }
        else{
            System.out.println("Invalid page number"); 
        }
    }
    public int getData(){
        if(page_no >0){
            return page_no;
        }
        else{
            System.out.println("Invalid page number");
            return 0;
        }
    }
}
public class Launch{
    public static void main(String[] args){
        Book b= new Book();
        b.setData(200);
        System.out.println(b.getData());
    }
}