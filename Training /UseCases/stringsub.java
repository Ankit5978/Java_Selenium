package training;

public class stringsub {
	    public static void main(String[] args) {
	    	 String str = "CODINGINJAVA";

	         int length = str.length();
	         System.out.println("Length of string: " + length);

	         char ch = str.charAt(4);
	         System.out.println("Character at index 4: " + ch);

	         String sub1 = str.substring(5);
	         System.out.println("Substring from index 5: " + sub1);  

	         String sub2 = str.substring(0, 5);
	         System.out.println("Substring from index 0 to 4: " + sub2); 

	         String newStr = str.concat("@456");
	         System.out.println("Concatenated string: " + newStr); 
	    }
	}

