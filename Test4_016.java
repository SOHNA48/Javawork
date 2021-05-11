package test;
import java.util.Scanner;
public class Test4_016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최소 신장 입력");
		int min = sc.nextInt();
		System.out.print("최대 신장 입력 :");
		int max = sc.nextInt();
		System.out.println("증가값");
		int num = sc.nextInt();
		float weight=0 ;
		System.out.println("신장 | 표준체중");
		System.out.println("--------------");
		for (int height = min; height<=max; height +=num) {
			 weight =(float) ((height -100)*0.9);
			 
			 System.out.println(height +" |"+ weight);
		}
		
		
	}
}
