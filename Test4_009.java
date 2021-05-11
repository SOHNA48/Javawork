package test;
import java.util.Scanner;
public class Test4_009 {
//양의 정수값을 읽어서 그 자리수를 출력하는 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("양의 정수값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		//int length =(int)(Math.log10(n)+1);
		//System.out.println(length);
		int x=0;
		while (n>0) {
			n =n/10;
					x++;
		}
		System.out.println(x);
		
			}
	
	}
