package training;

public class searchingmethods {
	 public static void main(String[] args) {
	        String str = "Java is creative and Java is popular.";

	        int indexChar = str.indexOf('p');
	        System.out.println("First index of 'p': " + indexChar);

	        int indexString = str.indexOf("Java");
	        System.out.println("First index of \"Java\": " + indexString);

	        	        int lastIndex = str.lastIndexOf("Java");
	        System.out.println("Last index of \"Java\": " + lastIndex);

	        	        boolean hasWord = str.contains("creative");
	        System.out.println("Contains 'creative'? " + hasWord);

	        boolean starts = str.startsWith("Java");
	        System.out.println("Starts with 'Java'? " + starts);

	        boolean ends = str.endsWith("popular.");
	        System.out.println("Ends with 'popular.'? " + ends);
}
}
