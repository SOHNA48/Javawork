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
			System.out.println("숫자를 입력하세요");
			pn = sc.nextInt();
			
			if (sn>pn) {
				System.out.println("시스템값보다 작습니다");
				
			}else if (sn<pn) {
				System.out.println("시스템값보다 큽니다");
			}
			
		}
	
		System.out.println("정답입니다");
		
		
		

	}

}
