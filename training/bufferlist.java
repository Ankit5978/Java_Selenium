package training;

public class bufferlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer receipt = new StringBuffer("     Nike SHOE STORE\n");
	       

	        receipt.append("Qty  Shoe Brand   Price\n");

	        receipt.append(" 1   Nike Air       ₹5999.00\n");
	        receipt.append(" 2   Puma Runner  ₹4598.00\n");
	        receipt.append(" 3   Adidas Neo     ₹3499.00\n");
	        
	        receipt.insert(0, "Store Number : 1234\n");
	        
	        int start = receipt.indexOf("Puma");
	        int end = start + "Nike".length();
	        receipt.replace(start, end, "Reebok"); 
	        
	        
	        int Start = receipt.indexOf("Adidas");
	        int End = receipt.indexOf("\n", Start) + 1;
	        receipt.delete(Start, End);
	        
	        receipt.append("--------------------------\n");
	        receipt.append("Total Items:      3\n");
	        receipt.append("Total Amount:     ₹14,096.00\n");

	        	        System.out.println(receipt.toString());
	}

}
