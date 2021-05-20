package nun_Snail;
//입력한 숫자크기만큼 달팽이 처럼 출력.
//------------------------------------------//
/*
 입력: 3
 출력: 123
      794
      765*/
//------------------------------------------//
public class numSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int arr[][] = new int[10][10];
		
		int x = 0;
		int y = 0;
		int n = 1;
		int f = num;
		
		for(int i=0;i<2*num-1;i++) {
			switch(i % 4) { //int가 0부터 시작했기 때문에 0과 4(실제로는 5)번째는 오른쪽으로 간다.
			case 0: //오른쪽
				for (int k = 0; k < f ;k++) {
					arr[y][x] = n;
					x++;
					n++;
				}
				x--;
				y++;

				f--;
				break;
			case 1: //아래
				for (int k = 0; k < f ;k++) {
					arr[y][x] = n;
					y++;
					n++;
				}
				y--;
				x--;
				break;
			case 2: //왼쪽
				for (int k = 0; k < f ;k++) {
					arr[y][x] = n;
					x--;
					n++;
				}
				x++;
				y--;
				
				f--;
				break;
			case 3: //위쪽
				for (int k = 0; k < f ;k++) {
					arr[y][x] = n;
					y--;
					n++;
				}
				y++;
				x++;
				break;
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num ; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
