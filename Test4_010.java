package test;
import java.util.Scanner;
public class Test4_010 {
//1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n = i;
		int result=i;
		
		while(n>1) {
			//System.out.println(result);
			result = result*(n-1);
			n--;
			
		}
		System.out.println(result);

	}

}
