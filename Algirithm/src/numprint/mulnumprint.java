package numprint;
//입력된 숫자만큼 행과 열이 연속되서 출력.
//-----------------------------------------//
/* 입력된 숫자크기의 행과 열이 만들어지고, 숫자는 점차 증가한다. 
 * 숫자의 크기는 행으로 증가하고, 열은 배수만큼 증가한다.  
입력: 3
출력: 123
     248
     369*/
//-----------------------------------------//
public class mulnumprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int [][] array = new int[num][num];
		
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				array[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
