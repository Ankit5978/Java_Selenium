package training;
import java.util.Scanner;

public class drive {

	 static String fileName;
	    static int fileSize;

		// TODO Auto-generated method stub


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("=== File Upload ===");
		        System.out.print("Enter file name: ");
		        fileName = sc.nextLine();

		        System.out.print("Enter file size (in KB): ");
		        fileSize = sc.nextInt();

		        uploadFile();

		        
		        System.out.println("\n=== File Download ===");
		        downloadFile();

		        sc.close();
		    }

		    
		    public static void uploadFile() {
		        System.out.println("Uploading file...");
		        System.out.println("File '" + fileName + "' of size " + fileSize + "KB uploaded successfully!");
		    }

		    
		    public static void downloadFile() {
		        System.out.println("Downloading file...");
		        System.out.println("File '" + fileName + "' of size " + fileSize + "KB downloaded successfully!");
		    }
		}
