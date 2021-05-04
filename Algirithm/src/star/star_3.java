package star;
//별 출력(star_1을 반대로)
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
public class star_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 3;
		
		for(int i=0;i<star;i++) {
			for(int j=0;j<star;j++) {
				if(i+j<(star-1))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
