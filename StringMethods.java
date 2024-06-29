package practice_questions;

public class StringMethods {

	public static void main(String[] args) {
		String intstr = "Hello, life is shit";
		
		//Substring
		String substring=intstr.substring(6,10);
		System.out.println("Sunstring(6 , 10):"+ substring);
		
		//Replace
		String replaceStr=intstr.replace("shit","perfect");
		
		//Upper case
		String uppercase=intstr.toUpperCase();
		System.out.println("Upper case: "+uppercase);
		
		//Lower case
		String lowercase =intstr.toLowerCase();
		System.out.println("Lower case: "+lowercase);
		
		//Char at
		char  charAt = intstr.charAt(6);
		System.out.println("Char at index 6: "+ charAt);
		
		//Length
		int length=intstr.length();
		System.out.println("Length:"+length);
		
		//Is empty
		boolean isEmpty=intstr.isEmpty();
		System.out.println("Is empty:"+isEmpty);
		
		//Starts with
		boolean startsWithHello=intstr.startsWith("Hello");
		System.out.println("Satrts with'Hello': "+ startsWithHello);
		
		//Ends with
		boolean endsWithShit=intstr.endsWith("shit");
		System.out.println("Ends with 'shit': "+endsWithShit);
		
		
		

	}

}
