package training;

public class comparisonmethod {
	public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "apple";
        String str3 = "Banana";

        boolean isEqual = str1.equals(str2);
        System.out.println("str1.equals(str2): " + isEqual);  // false

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("str1.equalsIgnoreCase(str2): " + isEqualIgnoreCase);  // true

        int cmp = str1.compareTo(str3);
        System.out.println("str1.compareTo(str3): " + cmp);  // Negative if str1 < str3

        int cmpIgnoreCase = str1.compareToIgnoreCase(str2);
        System.out.println("str1.compareToIgnoreCase(str2): " + cmpIgnoreCase);  // 0
    }
}
