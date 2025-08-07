package training;

public class strtrimming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "   coding in java is amazing and java is popular   ";

        String trimmed = str.trim();
        System.out.println("Trimmed: >" + trimmed + "<");

        String replacedChar = trimmed.replace('i', '!');
        System.out.println("Replaced 'i' with '!': " + replacedChar);

        String replacedWord = trimmed.replace("java", "Python");
        System.out.println("Replaced 'java' with 'Python': " + replacedWord);

        String replacedAll = trimmed.replaceAll("\\bjava\\b", "C++");
        System.out.println("Replaced all exact 'java' words with 'C++': " + replacedAll);

        String replacedFirst = trimmed.replaceFirst("java", "Go");
        System.out.println("Replaced only first 'java' with 'Go': " + replacedFirst);

	}

}
