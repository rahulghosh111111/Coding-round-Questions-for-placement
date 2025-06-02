package Abstraction;

abstract class Animal {
    abstract public void eat();

    abstract public void sleep();

    abstract public void foodHabit();
}

class deer extends Animal {
    public void eat() {
        System.out.println("Deer is eating");
    }

    public void sleep() {
        System.out.println("Deer is sleeping");
    }

    public void foodHabit() {
        System.out.println("Deer is herbivorous");
    }
}
class tiger extends Animal {
    public void eat() {
        System.out.println("Tiger is eating");
    }

    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    public void foodHabit() {
        System.out.println("Tiger is Hunting");
    }
}

class monkey extends Animal {
    public void eat() {
        System.out.println("Monkey is eating");
    }

    public void sleep() {
        System.out.println("Monkey is sleeping");
    }

    public void foodHabit() {
        System.out.println("Monkey is omnivorous");
    }
}

class forest {
    public void permit(Animal ref) {
        ref.eat();
        ref.sleep();
        ref.foodHabit();
    }
}

public class launch2 {
    public static void main(String[] args) {
        forest f = new forest();
        tiger t = new tiger();
        deer d = new deer();
        monkey m = new monkey();
        f.permit(t);
        f.permit(d);
        f.permit(m);
    }
}
