package example0416;
import java.util.Scanner;
public class Test4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (true) {
		if (n>99 && n<1000) {
			System.out.println("d");
			break;
		}else {
			System.out.println("�ٽ� �Է��ϼ���");
			n = sc.nextInt();
		}
		}
	}

}
