package Recursion;
//입력된 단지의 수와 각 단지의 세대수를 출력
//------------------------------------------//
/*
//1이 연결되어 있으면 하나의 단지, 1의 갯수가 해당 단지의 세대수
//왼쪽 위를 보면 1이 3개면 1개의 단지에 세대수가 3개인 것이다.
 입력: 00011
      00001
      10000
      11000
      11011
 
 출력:  단지수 : 3
       단지의 세대수 :  3 5 2*/
//------------------------------------------//
public class Apartment {
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int apartcnt = 0;
	static int []house = new int [10];
	
	static int [][] map=
				{{0,0,0,1,1},
				{0,0,0,0,1},
				{1,0,0,0,0},
				{1,1,0,0,0},
				{1,1,0,1,1}};
	public static void fun(int x, int y, int apartIndex) {
		//1이었던것을 0으로 바꿔줘야 다음 재귀함수 때는 검색하지 않는다.
		map[x][y] = 0;
		house[apartIndex]++;
		
		if(x-1>=0 && map[x-1][y]==APART)
			fun(x-1,y,apartIndex);
		if(x+1<=SIZE-1 && map[x+1][y]==APART)
			fun(x+1,y,apartIndex);
		if(y+1<=SIZE-1 && map[x][y+1]==APART)
			fun(x,y+1,apartIndex);
		if(y-1>=0 && map[x][y-1]==APART)
			fun(x,y-1,apartIndex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<SIZE;i++) {
			for(int j = 0;j<SIZE;j++) {
				if(map[i][j]==1) {
					fun(i,j,apartcnt);
					apartcnt++;
				}
			}
		}
		System.out.println(apartcnt);
		for(int i:house) {
			System.out.print(i+" ");
		}
	}
}
