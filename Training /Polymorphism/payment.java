package training;

public class payment {
	

	    abstract static class Payment {
	        abstract void pay(double amount);
	    }

	    static class CreditCardPayment extends Payment {
	        @Override
	        void pay(double amount) {
	            System.out.println("Paid ₹" + amount + " using Credit Card.");
	        }
	    }

	    static class UPIPayment extends Payment {
	        @Override
	        void pay(double amount) {
	            System.out.println("Paid ₹" + amount + " using UPI.");
	        }
	    }

	    public static void main(String[] args) {
	        Payment creditCard = new CreditCardPayment();
	        creditCard.pay(10.00);

	        Payment upi = new UPIPayment();
	        upi.pay(500.00);
	    }
	

}
