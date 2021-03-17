package Arrays;

import java.util.Scanner;

public class MarksOfStudentAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of students");
		int n = sc.nextInt();
		
		int a[] = new int [n];
		System.out.println("enter marks");
		
		for(int i=0;i<n;i++) {
			 a[i]= sc.nextInt();
			
		}
		int average =0;
		for(int i=0;i<n;i++) {
			average += a[i];
		}
		average /=n;
		System.out.println("the average is "+ average);
		

	}

}
