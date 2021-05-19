package numcount;
//입력된 숫자의 개수를 출력
//---------------------------------------------------------//
/*
예제
입력 : 32158321
출력 : 
0:0
1:2
2:2
3:1
4:0*/

public class numcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=3215483;
		
		int array [] = new int [input]; //count하기 위한 변수
		
		while(input>0) {
			array[input%10]++;
			input/=10;
		}
		
		//출력
		for(int i=0;i<10;i++) {
			System.out.println(i+":"+array[i]);

		}
	}
}
//깃연결 확인
//다시확인
