package decimal;
import java.util.*;
public class Decimal_All {
	public static void decimal(int i) {
		if(i<1) {
			return;
		}
		if(i==2) {
			System.out.println(i);
			return ;
		}
		for(int j=2;j<i;j++) {
			if(j%i==0)
			System.out.println(i);
			return ;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 1;i<input;i++) {
			decimal(i);
			
		}
	}

}
