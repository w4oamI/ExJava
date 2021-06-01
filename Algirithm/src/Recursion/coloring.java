package Recursion;
//색칠하기
//------------------------------------------//
/*
 조건: 재귀를 이용한다.
      0은 모두 이어져 있다.
 입력: 0000
      0101
      0011
      1000
      
 출력: 2222
      2121
      2211
      1222 
 */
//------------------------------------------//
public class coloring {
	static final int SIZE = 4;
	static final int COLOR = 2;
	
	static int [][] map =
		{{0,0,0,0},
		 {0,1,0,1},
		 {0,0,1,1},
		 {1,0,0,0}};
	
	public static void color(int x, int y) {
		if(map[x][y] != 1)
			map[x][y] = COLOR;
		
		//x축 왼쪽으로 이동
		if(x-1>=0 && map[x-1][y] != COLOR && map[x-1][y]!= 1)
			color(x-1,y);
		//x축 오른쪽으로 이동
		if(x+1 <= SIZE-1 && map[x+1][y] != COLOR && map[x+1][y]!= 1)
			color(x+1,y);
		//y축 밑으로 이동
		if(y+1 <= SIZE-1 && map[x][y+1] != COLOR && map[x][y+1]!= 1)
			color(x,y+1);
		//y축 위로 이동
		if(y-1>=0 && map[x][y-1] != COLOR && map[x][y-1]!= 1)
			color(x,y-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력된 배열을 우선 출력한다.
		//---------------------------------//
		for(int i = 0; i<SIZE;i++) {
			for(int j = 0; j<SIZE;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		//---------------------------------//
		
		System.out.println();
		System.out.println();
		
		color(0,0);       //[0,0]인덱스 부터 확인 해야한다.
		
		//변경된 배열을 출력한다.
		//---------------------------------//
		for(int i = 0; i<SIZE;i++) {
			for(int j = 0; j<SIZE;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		//---------------------------------//
	}

}
