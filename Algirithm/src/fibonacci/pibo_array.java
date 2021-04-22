package fibonacci;
//피보나치 수열
//---------------------------------------------------------//
/*조건
배열을 이용하여 구현.
피보나치 수열: 1 1 2 3 5 8 13 21....*/
//---------------------------------------------------------//
public class pibo_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[100];
		
		array[1]=1;
		array[2]=1;
		
		//foreach를 사용할 경우 0부터 검사하기 때문에 for문을 사용.
		for(int i=3; i<array.length;i++) {
			array[i]=array[i-1]+array[i-2];
		}
		for(int i=1; i<10;i++) {
			System.out.println(array[i]);
		}
	}

}
