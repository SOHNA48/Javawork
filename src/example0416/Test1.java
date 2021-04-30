package example0416;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int a= sc.nextInt();
		System.out.println("두번째 숫자 : ");
		int b= sc.nextInt();
		System.out.println("세번째 숫자 : ");
		int c=sc.nextInt();
		
		
		if (a>b) {
			if (b>c) {
				System.out.println("최솟값은 c");
			} else  {
				System.out.println("최솟값은 b");
			}
		}
		else if (a<b) {
			if (a>c) {
				System.out.println("최솟값은 c");
			} else  {
				System.out.println("최솟값은 a");
			}
		}

	}

}
