package star;
//별 출력
//------------------------------------------------//
/*
예제)
입력: 3
출력:
*
**
***
      */
//------------------------------------------------//
public class star_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5;
		
		for(int i=1;i<=star;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
