// Encapsulation is the process of wrapping data and code together as a single unit.
package Encapsulation;
 class Dog {
    private String breed; // here breed is instance variable
    private float age;
    private int price;

    public void setDog(String breed, float age, int price) { // here breed is local variable
        this.breed = breed;
        this.age = age;
        this.price = price;
    }
    public String getBreed() {
        return breed;
    }
    public float getAge() {
        return age;
    }
        public int getPrice() {
        return price;
    }
    public Dog(){                                         // constructor overloading
        breed = "bulldog";
        age = 6.5f;
        price = 10330;
    }
}
    public class Launch2 {
        public static void main(String[] args) {
            Dog d = new Dog();
             
            d.setDog("Pug", 2.5f, 20000);
            System.out.println("Breed: " + d.getBreed());
            System.out.println("Age: " + d.getAge());
            System.out.println("Price: " + d.getPrice());

            Dog d1= new Dog();
            System.out.println("Breed: " + d1.getBreed());
            System.out.println("Age: " + d1.getAge());
            System.out.println("Price: " + d1.getPrice());

            
        }
    
    }

