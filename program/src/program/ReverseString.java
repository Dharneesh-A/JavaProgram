package program;
public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello";
		char ch;
		String s= "" ;
		for(int i =0;i<str.length();i++) {			
		ch=str.charAt(i);
	     s= ch+s;
		}
		System.out.print(s);
		if (str.equals(s)) {
			System.out.println(" palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}
	}

}
