package example0416;
import java.util.Scanner;
public class Tesr4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry =1;
		while (retry ==1) {
			System.out.println("�������� �Է��ϼ���");
			int n = sc.nextInt();
			if (n>=0) {
				System.out.println("�� ���� ����Դϴ�.");
				
			}
			else {
				System.out.println("�� ���� ���� �Դϴ�.");
				
		}
			System.out.println("�ٽ��ѹ� �Է��Ͻðڽ��ϱ�? yes:1");
			retry = sc.nextInt();
		
		}

	}

}
