package plus_minus;
//더하기와 마이너스
//---------------------------------------//
/* 입력된 숫자에 +와 -를 차례대로 반복한다.
 입력: 5
 출력: 1+2-3+4-5 
 */
//---------------------------------------//
import java.util.*;

public class plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean Flag = true;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i==num) {
				System.out.print(i);
				break;
			}
			if(Flag) {
				System.out.print(i+"+");
				Flag= !Flag;
			}
			else {
				System.out.print(i+"-");
				Flag = !Flag;
			}
		}
	}

}
