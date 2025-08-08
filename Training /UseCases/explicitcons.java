package training;
class Animal {
    Animal() {
        System.out.println("Animal object created using explicit constructor");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}
public class explicitcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a = new Animal(); 
        a.sound();

	}

}
