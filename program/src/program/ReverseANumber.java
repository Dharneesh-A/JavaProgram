package program;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
	int a, rev = 0,rem;
	a= sc.nextInt();
	int n=a;
	while (a!=0) {
		rem = a%10; // 1234%10 = 4
		rev =  rev *10+rem; // 0*10 + 4 = 4
		a=a/10; // 1234 / 10 = 123	
	}
	System.out.println("reversed no is "+rev);
	if (n==rev) {
		System.out.println(rev+ "is palindrome");
	}
	else {
		System.out.println(rev+ " not paliindrome");
	}
	}

}
