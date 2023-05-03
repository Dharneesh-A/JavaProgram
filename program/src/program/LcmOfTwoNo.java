package program;

import java.util.Scanner;

public class LcmOfTwoNo {

	public static void main(String[] args) {
		System.out.println("enter 2 no: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		int max;
		max = a>b?a:b;
		while(true) {
		
		if(max%a==0 && max%b==0) {
		int 	lcm = max;
			System.out.println(lcm);
			break;
		}
		max++;
		}

	}

}
