package program;

public class ReverseAnSentence {

	public static void main(String[] args) {
		String str ="Good Morning";
		String s ="";
		
		String [] st = str.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			
		System.out.print(st[i]+" ");
		}
		
	}

}