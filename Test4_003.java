package test;
import java.util.Random;
import java.util.Scanner;
public class Test4_003 {

	public static void main(String[] args) {
		Random random = new Random();
		int sn = (random.nextInt(90))+10;
		int pn=0;
		Scanner sc = new Scanner(System.in);
		while (sn !=pn) {
			System.out.println("���ڸ� �Է��ϼ���");
			pn = sc.nextInt();
			
			if (sn>pn) {
				System.out.println("�ý��۰����� �۽��ϴ�");
				
			}else if (sn<pn) {
				System.out.println("�ý��۰����� Ů�ϴ�");
			}
			
		}
	
		System.out.println("�����Դϴ�");
		
		
		

	}

}
