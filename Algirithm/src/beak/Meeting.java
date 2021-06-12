package beak;
//회의실 배정[백준_1931]
//------------------------------------------//

//------------------------------------------//
import java.util.*;

public class Meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //회의 최대 갯수
		
		//time[][0] 시작
		//time[][1] 종료
		int [][] time = new int[N][2];
		
		for(int i=0;i<N;i++) {
			time[i][0] = sc.nextInt(); //시작시간
			time[i][1] = sc.nextInt(); //종료시간
		}
		
		//끝나는 시간을 기준으로 정렬하기 위해 comparator 재정의
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i=0;i<N;i++) {
			
			//직전 종료시간이 다음 회의 시간보다 작거나 같으면 갱신\
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		System.err.println(count);
	}

}
