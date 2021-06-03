package Recursion;
import java.util.*;
//입력된 수를 높은 수부터 출력한다.
//------------------------------------------//
/*
 입력: 2312
 출력: 2
      3
      1
      2*/
//------------------------------------------//
public class Num_Extract {
	public static void extract(int num) {
		if(num/10==0) {
			System.out.println(num);
			return;
		}
		extract(num/10);
		System.out.println(num%10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		extract(num);
		
		System.out.println();
		System.out.println(790/10);
		
		// 배열 안 값들의 평균값 구하기

		// 총점 값
				int sum = 0 ;
				
				// 평균 값 
				float avg = 0f;
				
				// 시험 성적 
				int[] score = { 100, 81, 93, 70, 55 };
				
				// score 배열에 저장된 값을 모두 추출하여 sum 변수에 다 더한다. 
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
				}
				
				avg = sum / (float) score.length ; 
				
				System.out.println("총점 : " + sum );
				System.out.println("평균 : " + avg );
	}

}
