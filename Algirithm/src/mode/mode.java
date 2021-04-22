package mode;
import java.util.*;
//최빈수
//---------------------------------------------------------//
/*조건
가장 많이 사용된 수를 구하라
예제: 
입력 : 1 1 1 8 6 7 8 2 4 6 7 5 7 9 7
출력 : 7*/
//---------------------------------------------------------//
public class mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = new int[10];
		
		//사용자 입력
		for(int i=0; i<10;i++) {
			num[i]=sc.nextInt();
		}
		
		//입력한 숫자를 카운트 하기위해 mode라는 배열사용
		int [] mode = new int[10];
		// mode[num[i]] 를 이용해 갯수 카운트
		// ex) i=0일때, mode[0]++ => 1 , mode[1]++ => 2....
		//     mode[1]=2 => 1번 숫자가, 2번 나왔다.
		
		for(int i=0;i<10;i++) {
			mode[num[i]]++;
		}
		
		
		int modenum=0; //최빈수
		int modecount=0; //최빈수의 카운트
		for(int i=0;i<0 ;i++) {
			if(modecount<mode[i]) {
				modecount = mode[i];
				modenum=i;
			}
			System.out.println("최빈수는 "+ modenum+ "count" + modecount);
		}
	}

}
