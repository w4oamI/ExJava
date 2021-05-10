package Palindrome;
//팰린드롬 확인
//----------------------------------------------------//
/*
 팰린드롭이란 대칭인지를 확인한다.
 예) 1115111는 5를 기준으로 대칭한다. 
    1234321는 4를 기준으로 대칭한다.
 */
//----------------------------------------------------//
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인덱스끼리 비교를 해야 하기 때문에 String으로 한다.
		String n = "12321";
		
		boolean flag =true;
		int len=n.length();
		System.out.println(len);

		
		//charAt은 배열처럼 사용하기 때문에 0번째부터 시작된다.
		//위의 예제로 보았을때, 12321의 n.charAt(4)는 1이다.
		for(int i=0;i<len;i++) {
			if(n.charAt(i) != n.charAt(len-i-1)) { //왼쪽은 →, 오른쪽은 ←으로 가기 때문에 -i
				flag=false;
			}
		}
		System.out.println(flag);
	}

}
