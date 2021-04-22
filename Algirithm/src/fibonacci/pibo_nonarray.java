package fibonacci;
//피보나치 수열
//---------------------------------------------------------//
/*조건
배열을 사용하지 않고 이용하여 구현.
피보나치 수열: 1 1 2 3 5 8 13 21....*/
//---------------------------------------------------------//
public class pibo_nonarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[100];
		
		int firnum = 1; //a-1번째
		int secnum = 1; //a-2번째
		
		System.out.print(firnum+" ");
		System.out.print(secnum+" ");
		
		for(int i=3;i<10;i++) {
			int sumnum=firnum+secnum;
			System.out.print(sumnum+" ");
			firnum=secnum;
			secnum=sumnum;
		}
		System.out.println();
		System.out.println("끝났습니다.");
	}

}
