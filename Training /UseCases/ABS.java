package training;

abstract class animal{
	abstract void sound();
    
	void eat() {
		System.out.println("animal eats food");
	}
}

class Dog extends animal{
	@Override
	void sound() {
		System.out.println("dog barks");

	}
}
public class ABS {
    public static void main(String[] args) {
    Dog f= new Dog();
    f.sound();
    f.eat();
    		
    }
}
