package practice_questions;
import java.util.Scanner;
public class ReplaceChar {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String str=Sc.nextLine();
		System.out.print("Enter the index to replace");
		int index=Sc.nextInt();
		Sc.nextLine();
		System.out.print("Enter the new character");
		char newchar = Sc.nextLine().charAt(0);
		if(index>=0 && index< str.length())
		{
			String newstr=str.substring(0,index)+newchar + str.substring(index-1);
			System.out.println("Updated string:"+newstr);
		}
		else
		{
			System.out.println("Index out of Bounds");
		}
		Sc.close();

	}

}
