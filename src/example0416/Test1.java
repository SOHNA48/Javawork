package example0416;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� : ");
		int a= sc.nextInt();
		System.out.println("�ι�° ���� : ");
		int b= sc.nextInt();
		System.out.println("����° ���� : ");
		int c=sc.nextInt();
		
		
		if (a>b) {
			if (b>c) {
				System.out.println("�ּڰ��� c");
			} else  {
				System.out.println("�ּڰ��� b");
			}
		}
		else if (a<b) {
			if (a>c) {
				System.out.println("�ּڰ��� c");
			} else  {
				System.out.println("�ּڰ��� a");
			}
		}

	}

}
