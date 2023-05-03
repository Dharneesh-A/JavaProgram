package program;

public class SwapNo {
public static void main(String[] args) {
	// using  3rd variable
	int a= 100,b=200;
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("after swap a= "+a);
	System.out.println("after swap b= "+b);
	// without using 3rd variable
	int d=18, e=29;
	d=d+e;
	e=d-e;
	d=d-e;
	System.out.println("after swap d= "+d);
	System.out.println("after  swap e = "+e);
}
}
