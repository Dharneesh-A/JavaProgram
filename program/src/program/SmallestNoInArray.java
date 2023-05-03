package program;

public class SmallestNoInArray {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int min=Integer.MAX_VALUE;// max value of integer
		for (int i= 0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
				System.out.println(arr[i]);
			}
		}

	}

}
