package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,9,0,4,23};
		int n=a.length;
		int temp =0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int item: a) {
			System.out.print(item+ "   ");
		}
	}

}
