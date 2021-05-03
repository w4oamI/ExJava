package gugudan;
import java.util.*;
//구구단 시작 단과 종료단을 입력받아 출력.
//------------------------------------------------//
/*
 예제)
 입력: 4 5\
 출력:
 4*1=4   5*1=5
 4*2=8   5*2=10
 ...     ...*/
//------------------------------------------------//
public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int startdan = sc.nextInt();
		int enddan = sc.nextInt();
		
		for(int j = startdan;j<=enddan;j++) {
			for(int i=1;i<10;i++) {
				System.out.println(j + "*" + i +"="+ j*i );
			}
			System.out.println();
		}
	}

}
