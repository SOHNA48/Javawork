package test;
import java.util.Scanner;
public class Test4_016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ּ� ���� �Է�");
		int min = sc.nextInt();
		System.out.print("�ִ� ���� �Է� :");
		int max = sc.nextInt();
		System.out.println("������");
		int num = sc.nextInt();
		float weight=0 ;
		System.out.println("���� | ǥ��ü��");
		System.out.println("--------------");
		for (int height = min; height<=max; height +=num) {
			 weight =(float) ((height -100)*0.9);
			 
			 System.out.println(height +" |"+ weight);
		}
		
		
	}
}
