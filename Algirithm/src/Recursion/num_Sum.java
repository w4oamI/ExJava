package Recursion;
//입력된 두 수까지의 합
//----------------------------------------------//
/*
 입력: 3
 출력: 6
 
 1+2+3*/
//----------------------------------------------//
import java.util.*;

public class num_Sum {

	public static int func(int first, int last) {
		if(first==last) {
			return first;
		}
		return first+func(first+1,last);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first;
		int last;
		first = sc.nextInt();
		last = sc.nextInt();
		
		int result = func(first,last);
		
		System.out.println(result);
	}

}
