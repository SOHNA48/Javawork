package test;
import java.util.Scanner;
public class Test4_015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		
		for (int i= 1; i<n+1; i++) {
			System.out.print(i);
			result = result+i;
			if (i>=1 & i<n) {
				System.out.print("+");
			}
			
	}
		System.out.println("="+result);

	}}
