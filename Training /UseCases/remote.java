package training;
public class remote {

    abstract static class Remote {
        abstract void turnOn();
        abstract void turnOff();
    }

    static class ACRemote extends Remote {
        @Override
        void turnOn() {
            System.out.println("AC is now ON. Cooling started.");
        }

        @Override
        void turnOff() {
            System.out.println("AC is now OFF. Cooling stopped.");
        }
    }

    public static void main(String[] args) {
        Remote myRemote = new ACRemote();

        myRemote.turnOn();
        myRemote.turnOff();
    }
}
