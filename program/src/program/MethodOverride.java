package program;

public class MethodOverride extends MethodOverload {
 void hello() {
	 System.out.println("hello");
 }
	public static void main(String[] args) {
		MethodOverride od = new MethodOverride();
		MethodOverload ol = new MethodOverload();
		ol.hello();
		od.hello();
	}

}
