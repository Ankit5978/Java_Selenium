package training;

public class jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] studyHours = new int[3][];

	        studyHours[0] = new int[] {2, 3, 4};

	        studyHours[1] = new int[] {1, 2, 3, 2, 1};

	        studyHours[2] = new int[] {0, 2, 4, 3, 5, 6, 2};

	        for (int i = 0; i < studyHours.length; i++) {
	            int total = 0;
	            for (int hours : studyHours[i]) {
	                total += hours;
	            }
	            System.out.println("Student " + (i+1) + " studied total " + total + " hours.");
	        }
	}

}
