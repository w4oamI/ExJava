package major;
import java.util.*;
public class major {
	
	//오름차순인지 확인
	public static void distinc(int input[]) {
		boolean a_Flag = true;
		boolean b_Flag = true;
		if(input[0] != 1) {
			a_Flag=false;
		}
		for(int i=1;i<input.length-1;i++) { //length는 크기가만큼 나온다. 배열은 0부터 시작이므로 -1
			if(input[i] - input[i+1] != -1) {
				a_Flag=false;
				break;
			}
		}
		
		if(input[0]!=8) {
			b_Flag= false;
		}
		for(int i=1;i<input.length-1;i++) {
			if(input[i]-input[i+1] != 1) { //
				b_Flag=false;
				break;
			}
		}
		if(a_Flag)
			System.out.println("ascending");
		else if(b_Flag)
			System.out.println("desending");
		else
			System.out.println("mixed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] input = new int[8];
		
		for(int i=0;i<8;i++) {
			input[i]=sc.nextInt();
		}
		
		distinc(input);
	}

}
