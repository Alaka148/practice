package practice_questions;
import java.util.Scanner;
public class ProgQ3 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=Sc.nextLine();
		System.out.println(str+(isPalindrome(str)?"is":"is not"+"a Palindrome string"));
		

	}

	public static boolean isPalindrome(String str) {
		int left=0,right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
