package numprint;
//입력된 숫자만큼 행과 열이 연속되서 출력.
//-----------------------------------------//
/* 입력된 숫자크기의 행과 열이 만들어지고, 숫자는 점차 증가한다. 
 * 이전 문제와 다른 점은 두번째줄이 456이 아닌, 654로 →(증가), ↓(끝에서 내려오기) ←(증가)  
입력: 3
출력: 123
     654
     789*/
//-----------------------------------------//
public class renumprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
		int array[][] = new int [num][num];
		
		
		//홀수 행은 654처럼 거꾸로 증가한다.
		for(int i=0;i<num;i++) {
			if(i%2==0) {
				for(int j=0;j<num;j++) {
					array[i][j] = i*num + j +1;
				}
			}
			else {
				for(int j=num-1;j>=0;j--) {
					array[i][j] = i*num+num-j;
				}
			}
		}
		
		
		//배열 출력
		for(int i=0;i<num;i++) {      //행
			for(int j=0;j<num;j++) {  //열
				System.out.printf("%4d",array[i][j]);
			}
			System.out.println();
		}
	}

}
