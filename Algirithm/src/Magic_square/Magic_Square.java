package Magic_square;
import java.util.*;
//마방진
//--------------------------------------------//
/*
 입력받은 크기만큼 마방진 만들기*/
//--------------------------------------------//
public class Magic_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		//입력받는 것이 짝수와 숫자가 아닐 경우 예외처리
		while(true){
		try {
		System.out.println("마방진 크기를 입력해주세요");
		num = sc.nextInt();
		if(num%2==1) break; //입력수가 홀수일때 반복문을 나간다
			System.out.println("홀수를 입력해주세요"); //입력수가 짝수일때 다시 반복
		}
		catch(InputMismatchException e){ //입력값이 숫자가 아닐 경우
			System.out.println("숫자만 입력해주세요.");
			}
		}
		sc.close(); //Scanner를 다쓴후 종료해준다.
		
		
		int [][] array = new int [num][num];
		int row,col; //행(row→). 열(col↓)
		int cnt;
		row=0; col=(num/2); //시작위치 지정
		
		//
		//----------------------------------------//
		for(cnt=1;cnt<=num*num;cnt++) {
			array[row][col]=cnt; //마방진 1부터 시작
			if(cnt%num==0) {
				row++;
				if(row==num)
					row=0;
			}
			else {
				row--;
				col++;
				if(row==-1)
					row=num-1;
				if(col==num)
					col=0;
			}
		}
			
		//출력
		//----------------------------------------//
		for(row=0;row<num;row++) {
			for(col=0;col<num;col++) {
				System.out.printf("%3d",array[row][col]);
			}
			System.out.println();
		}
		//----------------------------------------//
	}

}
