package practice_questions;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a string which is going to be reversed");
		String str=Sc.nextLine();
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("reverse string is");
		System.out.println(reverse);

	}

}
