package test;
import java.util.Scanner;
public class Test4_009 {
//���� �������� �о �� �ڸ����� ����ϴ� ���α׷�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� �������� �Է��ϼ��� : ");
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
