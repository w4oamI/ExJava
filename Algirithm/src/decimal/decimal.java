package decimal;
//소수를 판별
//-----------------------------------------//
/*
 입력된 수가  소수인지 판별
 입력: 27
 출력: 소수입니다.*/
//-----------------------------------------//
public class decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
		boolean flag = true;
		
		//소수가 아닌것은 2로 나누어 떨어지기 때문에, 2부터 시작해야한다. 1부터 시작하면 모든 수가 나누어 떨어진다.
		//자기 자신을 제외한 숫자를 처리할 것이기 때문에 num까지
		for(int i=2;i<=num-1;i++) {
			if(num % i  == 0) {
				flag=false;
			}
			
		}
		
		if(flag) {
			System.out.println(num+"은 소수입니다.");
		}
		else
			System.out.println(num+"은 소수가 아닙니다.");
	}

}
