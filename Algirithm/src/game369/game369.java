package game369;
//369게임
//------------------------------------------------//
/*
예제)
입력: 1~100까지 369게임
12짝45짝78짝....
*/
//------------------------------------------------//
public class game369 {

	public static int getnum(int i) {
		int k = 0;
		
		while(i>0) {
			if(i%10==3 || i%10==6 || i%10==9)  //if{}안에 i/=10을 하게 되면 이곳에서 무한 루프 돈다.
				k++;
			i/=10;
		}
 		return k;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		
		for(int i=1;i<=n;i++) {
			int cnt = getnum(i);
			
			if(cnt==0) {
				System.out.print(i+" ");
			}
			else {
				for(int j=0;j<cnt;j++ ) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}
	}
}
