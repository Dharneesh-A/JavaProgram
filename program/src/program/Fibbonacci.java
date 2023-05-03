package program;

public class Fibbonacci {

	public static void main(String[] args) {
		int no =10,n1=0,n2=1,n3;
		int i=0;
		System.out.println(n1);
		System.out.println(n2);
		while(i<no) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
			System.out.println(n3);
		}
		
	}

}
