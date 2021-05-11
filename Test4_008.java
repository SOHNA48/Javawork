package test;
import java.util.Scanner;
public class Test4_008 {
//입력받은 숫자의 개수만큼 *과 +를 번갈아가며 표시하는 프로그램을 작성해보세요
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("몇개를 출력할까요? :");
		int n = sc.nextInt();
		
		for (int i=n; i>0; i--) {
			if (i%2==0)
			System.out.print("+");
			else
				System.out.print("*");
			
		
		}System.out.println();

	}

}
