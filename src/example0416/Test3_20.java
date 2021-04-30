package example0416;
import java.util.Random;
public class Test3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random =new Random();
		
		int n = random.nextInt(3);
		
		if (n ==0) {
			System.out.println("가위");
		}
		else if (n ==1) {
			System.out.println("바위");
		}
		else if (n ==2) {
			System.out.println("보");
		}
		
		switch (n) {
		case 0: System.out.println("가위");
			break;
		case 1: System.out.println("바위");
		break;
		case 2: System.out.println("보");
		break;
		}
		

	}

}
