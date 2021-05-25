package major;
//음계 출력
//--------------------------------------------//
/*
 1부터 8까지 차례대로 입력되었을 경우와, 
 8부터 1까지 차례대로 입력되었을 경우와,
 아무숫자가 입력되었을 경우 출력한다.
 입력: 1 2 3 4 5 6 7 8
 출력: ascending
 
 입력: 8 7 6 5 4 3 2 1
 출력: desending
 
 입력: 1 2 8 4 6 8 2 1
 출력: mixed
*/

//length는 크기가만큼 나온다. 배열은 0부터 시작이므로 -1
//--------------------------------------------//
import java.util.*;
public class major {
	
	//오름차순인지 내림차순인지 확인
	public static void distinc(int input[]) {
		boolean a_Flag = true;
		boolean b_Flag = true;
		
		//오른차순 확인
		//-----------------------------------//
		if(input[0] != 1) {
			a_Flag=false;
		}
		
		for(int i=1;i<input.length-1;i++) { 
			if(input[i] - input[i+1] != -1) {
				a_Flag=false;
				break;
			}
		}
		//-----------------------------------//
		
		//내림차순 확인
		//-----------------------------------//
		if(input[0]!=8) {
			b_Flag= false;
		}
		for(int i=1;i<input.length-1;i++) {
			if(input[i]-input[i+1] != 1) { //
				b_Flag=false;
				break;
			}
		}
		//-----------------------------------//
		
		//결과출력
		//-----------------------------------//
		if(a_Flag)
			System.out.println("ascending");
		else if(b_Flag)
			System.out.println("desending");
		else
			System.out.println("mixed");
		//-----------------------------------//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] input = new int[8];
		
		for(int i=0;i<8;i++) {
			input[i]=sc.nextInt();
		}
		
		distinc(input);
	}

}
