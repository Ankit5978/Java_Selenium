package training;
import java.util.Scanner;

public class chatbot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("🤖 ChatBot: Hello! Type something (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase(); 

            if (input.equals("hi") || input.equals("hello")) {
                System.out.println(" ChatBot: Hey there! How can I help you?");
            } else if (input.contains("how are you")) {
                System.out.println(" ChatBot: I'm just a bot, but I'm doing great! ");
            } else if (input.contains("your name")) {
                System.out.println("ChatBot: I’m ChatBot 1.0, your virtual buddy!");
            } else if (input.contains("time")) {
                System.out.println(" ChatBot: Sorry, I don’t have a watch right now! ");
            } else if (input.contains("bye")) {
                System.out.println(" ChatBot: Bye! Have a nice day ");
                break;
            } else {
                System.out.println("ChatBot: Sorry, I didn't understand that.");
            }
        }

        sc.close();

	}

}
