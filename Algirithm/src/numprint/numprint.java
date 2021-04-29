package numprint;
//입력된 숫자만큼 행과 열이 연속되서 출력.
//-----------------------------------------//
/* 입력된 숫자크기의 행과 열이 만들어지고, 숫자는 점차 증가한다. 
 입력: 3
 출력: 123
      456
      789*/
//-----------------------------------------//
public class numprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
		int output = 1;
		//간단한 풀이
		//-----------------------------------------//
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.printf("%3d",output);
				output++;
			}
			System.out.println();
		}
		//-----------------------------------------//
		
		
		System.out.println();
		
		
		//수식을 사용하여 풀이
		//-----------------------------------------//
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.printf("%3d",i*(num)+j+1);  //j=0부터시작하고 <num까지 이기 때문에 +1을 해야한다.
			}
			System.out.println();
		}
		//-----------------------------------------//
	}

}
