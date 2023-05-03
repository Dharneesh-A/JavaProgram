package program;

public class SumOfArray {

	public static void main(String[] args) {
	
int a[]= {1, -1, 3, 0, 5};
int n=4,sum=0;
	for (int i=0;i<=n;i++) {
	if (i%2!=0) {
		sum=sum + a[i];
			}
	}
	System.out.println(sum);
}

}
