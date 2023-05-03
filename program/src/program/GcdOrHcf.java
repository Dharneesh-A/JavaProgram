package program;

import java.util.Scanner;

public class GcdOrHcf {

	public static void main(String[] args) {
		System.out.println("enter 2 no: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		int min = a<b?a:b;
		while(true) {
		if(a%min==0 && b%min==0) {
		int gcd = min;	
			System.out.println(gcd);
			break;
		}
		min--;
		}
	}

}
