package program;

public class Pattern {
	public static void main(String[] args) {
		Pattern pt = new Pattern();
		//pt.print_D();
		//pt.print_P();
		//pt.print_B();
		//pt.print_O();
		//pt.print_A();
		//pt.print_C();
		//pt.print_F();
		//pt.print_S();
		pt.star1();
	}

	private void star1() {
		for (int row=1;row<=5;row++) {
			for (int col=4;col>=row;col--) {
				System.out.print("  ");
			}
			for(int col1=1;col1<=row;col1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private void print_F() {
		for (int row = 1;row<=9;row++) {
			for (int col= 1;col<=9;col++) {
				 if (row==1|| row==5){
					 
					System.out.print("*  ");
					 } 
					 else if (col==1){
						
					 System.out.print("*  ");
					 }
					 else 
					 {
					 System.out.print("  ");
					 }
			}
			System.out.println();
		}
		
	}

	private void print_S() {
		for (int row =1;row<=9;row++) {
			for (int col =1;col<=9;col++) {
				if (col==1&&row!=1&&row<5) {
					System.out.print("*  ");
				}
				else if (col==9&&row>5&&row!=9) {
					System.out.print("*  ");
				}
				if (row==1|| row==5|| row==9)
				{
					if (col==1) {
						System.out.print("  ");
					}
					else {
				System.out.print("*   ");
					        }
				}
				else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

	private void print_C() {
		for (int row = 1;row<=9;row++) {
			for (int col= 1;col<=9;col++) {
				 if (row==1|| row==9){
					 
					System.out.print("*  ");
					 } 
					 else if (col==1){
						
					 System.out.print("*  ");
					 }
					 else 
					 {
					 System.out.print("  ");
					 }
			}
			System.out.println();
		}
		
	}

	private void print_O() {
		for (int row=1;row<=9;row++) {
			for (int col=1;col<=9;col++) {
				if (row==1||row==9) {
					if (col==1|| col==9) {
					System.out.print("    ");
				}
					else {
						System.out.print("*  ");
					}
				}
				else if (col==1||col==9) {
					
					System.out.print("*  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println("  ");
		
		}
		
	}

	private void print_A() {
		for (int row=1;row<=9;row++) {
			for (int col=1;col<=9;col++) {
				if (row==1|| row==9) {
				
					System.out.print("*  ");
				
					
				}
				else if (col==1||col==9) {
					
					System.out.print("*  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println("  ");
		
		}
		for (int row= 1;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				if(col==1|| col==9) 
				  System.out.print("*  ");
				else 
					System.out.print("    ");
			}
			System.out.println("  ");
		}
	}
	

	private void print_B() {
		print_D();
		for (int row=1;row<=9;row++) {
			for (int col=1;col<=9;col++) {
				if (row==9) {
					if (col!=9) {
					System.out.print("*  ");
				}
				}
				else if (col==1||col==9) {
					System.out.print("*  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println("  ");
		
		}
		
		
	}

	private void print_P() {
		print_D();
		for (int col=1;col<=9;col++) {
			System.out.println("*  ");
		}
		
	}

	private void print_D() {
		for (int row=1;row<=9;row++) {
			for (int col=1;col<=9;col++) {
				if (row==1||row==9) {
					if (col!=9) {
					System.out.print("*  ");
				}
				}
				else if (col==1||col==9) {
					System.out.print("*  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println("  ");
		
		}
		}
		}
	


