package test;

import java.util.Scanner;
public class Test4_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) {
		for (int i =a+1; i<b; i++) {
			System.out.println(i );
		}
		}else if (a>b) {
		for (int i =b+1; i<a; i++) {
			System.out.println(i );
		}
		}
	}

}
