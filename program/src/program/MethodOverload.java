package program;

public class MethodOverload {
		static int sum(int x, int y) {
				return x+y;
}
	static int sum(int a, int b, int c ) {
				return a+b+c;
	
}
		void hello() {
				System.out.println("override class example");
}

			public static void main(String[] args) {
	
	System.out.println(sum(10,20));
	System.out.println(sum(10,20,300));
	}
}
