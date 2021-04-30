package example0416;
import java.util.Scanner;
public class Tesr4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry =1;
		while (retry ==1) {
			System.out.println("정수값을 입력하세요");
			int n = sc.nextInt();
			if (n>=0) {
				System.out.println("이 값은 양수입니다.");
				
			}
			else {
				System.out.println("이 값은 음수 입니다.");
				
		}
			System.out.println("다시한번 입력하시겠습니까? yes:1");
			retry = sc.nextInt();
		
		}

	}

}
