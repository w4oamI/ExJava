package constant;
//상수 출력
//----------------------------------------//
/*
 압력: 734 893
 상수는 437 398로 나오고
 출력: 437이 나온다.*/
//----------------------------------------//
public class constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 734;
		int b = 893;
		
		int [] arrayA = new int [3];
		int [] arrayB = new int [3];
		
		//a를 일의자리를 뽑아 배열에 저장.
		//--------------------------------//
		int len =0;
		do {
			arrayA[len] = a %10;
			a/=10;
			len++;
		}while(a>0);
		//--------------------------------//
		
		//배열로 나누어진거 다시 정수로 변환
		//--------------------------------//
		int totala = 0;
		int num = 1;
		for(int i=arrayA.length-1;i>=0;i--) {
			 totala += arrayA[i]*num;
			 num*=10;
		}
		System.out.println(totala);
		//--------------------------------//
		
		//b를 일의자리를 뽑아 배열에 저장.
		//--------------------------------//
		len =0;
		do {
			arrayB[len] = b %10;
			b/=10;
			len++;
		}while(b>0);
		//--------------------------------//
		
		//배열로 나누어진거 다시 정수로 변환
		//--------------------------------//
		int totalb = 0;
		num = 1;
		for(int i=arrayB.length-1;i>=0;i--) {
			 totalb += arrayB[i]*num;
			 num*=10;
		}
		System.out.println(totalb);
		//--------------------------------//
		
		if(totala>totalb)
			System.out.println(totala);
		else
			System.out.println(totalb);
	}

}
