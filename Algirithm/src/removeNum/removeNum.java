package removeNum;
//중복된 수를 제거
/*
 예시)
 입력: 1 1 1 3 2 1
 출력: 1 3 2*/
//----------------------------------------------------//
public class removeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] arry = new boolean[10];
		int [] array = new int[10];
		
		array[0]=1;
		array[1]=1;
		array[2]=1;
		array[3]=3;
		array[4]=2;
		array[5]=1;
		array[6]=1;
		array[7]=1;
		array[8]=1;
		array[9]=1;
		
		
		for(int i=0;i<array.length;i++) {
			arry[array[i]] = true;
		}
		
		for(int i=0;i<array.length;i++) {
			if(arry[i]==true)
				System.out.println(i+" ");
		}
	}

}
//----------------------------------------------------//