package Dex_Transfom;
//진법변환 할 수를 입력받고, 변환할 진법을 입력받고 진법 변환
//-----------------------------------------------//
/*
 입력: 200 16
 출력: C8
 */
//-----------------------------------------------//
public class Dex_Transfom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Dex = 200;
		int Transfom = 16;
		int i = 0;
		//16진수는 A,B,C ... 이 있기 때문에 char를 선언
		char n[] = new char[100];
		
		while(Dex>0) {
			int tmp = Dex % Transfom;
			
			if(tmp>= 10 && tmp <=15) {
				n[i]=(char)('A'+(tmp-10)); //tmp가 10일경우 'A', 11일 경우 'A'+1='B' 
			}
			else {
				n[i]=(char)('0'+tmp); //tmp가 int기 때문에 char로 바꾸고 넣는다.
			}
			Dex/=Transfom;
			i++;
		}
		
		for(;i>=0;i--) {
			System.out.print(n[i]);
		}
	}

}
