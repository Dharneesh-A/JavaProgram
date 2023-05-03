package program;
import java.util.*;
public class PrintPrime {
public static void main(String[] args) {
  System.out.println("enter startingand ending no ");
	Scanner sc = new Scanner(System.in);
	int no1=sc.nextInt();
	int no2=sc.nextInt();		
	int i,j;
for( i= no1;i<=no2;i++) {
	
	for(j =2;j<=i;j++) {
		if(i%j==0) {
			break;
		}	
	}
	if(i==j) {
		System.out.println(i);
	}
}
}
}