package training;
import java.util.Scanner;
import java.util.*;

public class chatbo {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        System.out.print("You: ");
	        String input = sc.nextLine().toLowerCase();

	        if (input.equals("hi")) {
	            String[] replies = {
	                "Hey! ",
	                "Hi there! ",
	                "Hello! Welcome "
	            };
	            System.out.println(" ChatBot: " + replies[rand.nextInt(replies.length)]);
	        } else {
	            System.out.println("ChatBot: I’m not sure how to respond to that.");
	        }

	}

}
