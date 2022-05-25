package testing1;

import java.lang.Character.Subset;

public class Testing1 {
	
	public static void main(String[] args) {
	
		String[] arr = new String[] {"Jacket $34 12%","Hoodie $25 5%","Shirt $12 50%",};
//		String[] arr = new String[] {"pants - 20$ -10%","Shorts - 15$ -10%",};
//		String[] arr = new String[] {"Bag $25.50 10%",};
//		String[] arr = new String[] {"Jacket $34 12%","Hoodie $25 5%","Shirt $12 50%",};
		System.out.println(arr);
		for(String str:arr) {
			System.out.println(str);
		}
		System.out.println(calculation(arr));

		
	}

	
	public static String calculation( String[] items ) {
	     double totalPrice = 0;
		 double salePrice = 0;
		 for(String item: items) {
			 java.util.Optional<String> priceStr = findPrice(item);
			 double price = Double.parseDouble(priceStr.get().substring(1));
		    
		    java.util.Optional<String> percentOffStr = findPercentOff(item);
		    double percentOff = Integer.parseInt(percentOffStr.get().substring(0, percentOffStr.get().indexOf("%")));

		    totalPrice += price;
		    salePrice += price - price*percentOff/100.0;
		 }
		 double amountSaved = totalPrice-salePrice;
	     StringBuffer sb = new StringBuffer();
	  	 sb.append("Total Original Price:$")
		   .append(String.format("%.2f", totalPrice))
		   .append(";Total sale price:$")
		   .append(String.format("%.2f", salePrice))
		   .append(";Amount saved:$")
		   .append(String.format("%.2f", amountSaved))
		   .append(";");
	   return sb.toString();
	}

	private static java.util.Optional<String> findPrice(String line) {
		String regex = "\\$\\d*";
		java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
		if(m.find()) {
			try{
			    String priceStr = m.group();
	 			return java.util.Optional.of(priceStr);
			}catch(java.time.format.DateTimeParseException ex) {
	 			return java.util.Optional.empty();
			} 
		 }
	     return java.util.Optional.empty();
	}
	private static java.util.Optional<String> findPercentOff(String line) {
		String regex = "(\\d*)%";
		java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
		if(m.find()) {
			try {
			  	String percentOffStr = m.group();
	 			return java.util.Optional.of(percentOffStr);
			}catch(java.time.format.DateTimeParseException ex) {
	 			return java.util.Optional.empty();
			} 
		 }
	     return java.util.Optional.empty();
	}

	
}
