package test;
import java.util.Scanner;
public class Test4_006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 *을 표시할까요?");
		int n = sc.nextInt();
		if (n>1) {
		for (int i= n; i>=1; i--) {
		System.out.print("*");
		if (i==1) {
			System.out.println();}
		}
		
		}else {
			for (int i= n; i>=1; i--) {
				System.out.print("*");}
		}
	}
	}


