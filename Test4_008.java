package test;
import java.util.Scanner;
public class Test4_008 {
//�Է¹��� ������ ������ŭ *�� +�� �����ư��� ǥ���ϴ� ���α׷��� �ۼ��غ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("��� ����ұ��? :");
		int n = sc.nextInt();
		
		for (int i=n; i>0; i--) {
			if (i%2==0)
			System.out.print("+");
			else
				System.out.print("*");
			
		
		}System.out.println();

	}

}
