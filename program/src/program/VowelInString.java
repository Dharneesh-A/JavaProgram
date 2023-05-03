package program;

public class VowelInString {
public static void main(String[] args) {
	String str = "education";
	System.out.println("vowel presented in "+str+" is " );
	int count= 0;
	for (int i=0;i<str.length();i++) {
		 char ch = str.charAt(i);
		 
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.print(ch+" ");
			count++;
			break;
			
		}
		
		}
	System.out.println("vowel count  is "+count);
	
	
}
}
