package percent;
//학생 수를 입력하고 점수를 입력했을때, 평균을 넘는 학생 비율을 출력
//--------------------------------------------------//
/*
 입력: 5 50 80 75 68 90
 출력: */
//--------------------------------------------------//
public class percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {5, 50, 80, 75, 68, 90};
		double sum=0;
		
		for(int i=1;i<n.length;i++) {
			sum+=n[i];
		}
		double avg = sum/n[0];
		System.out.println(avg);
		
		int cnt=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]>avg)
				cnt++;
		}
		
		System.out.println((cnt/(double)n[0])*100);
	}

}
