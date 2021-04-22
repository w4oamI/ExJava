package fibonacci;

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
	}

}
