package star;
//별 출력(역으로 출력)
//------------------------------------------------//
/*
예제)
입력: 3
출력:
***
 **
  *
    */
//------------------------------------------------//
public class star_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5;
		
		for(int i=0;i<star;i++) {
			for(int j=0;j<star;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
