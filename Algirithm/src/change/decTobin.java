package change;
import java.util.*;
//10진수 2진수 변환
//---------------------------------------------//
/*
 입력: 
 */
//---------------------------------------------//
public class decTobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 19;
		
		//2진수로 변환된 값저장 변수.
		int bin[] = new int[100];
		
		
		int num = input;
		int i=0;
		while(num>0){
			bin[i]= num%2;
			num/=2;
			i++;
		}
		i--;  //마지막에 증감을 하고 나오기 때문에 6번이 반복되야 한다면 i는 7이 되버린다.
		for(;i>=0;i--) {
			System.out.print(bin[i]);
		}
	}

}
