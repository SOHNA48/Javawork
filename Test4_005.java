package test;
import java.util.Scanner;
public class Test4_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("카운트 다운 시작 \r양수값입력 : ");
		int num = sc.nextInt();
		
		for (int i = num; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("종료후 변수값"+i);

	}

}
