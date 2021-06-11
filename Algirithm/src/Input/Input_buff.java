package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_buff {

	public static void main(String[] args)throws IOException { //throws IOException는 입출력 예외처리
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine(); //readLine()를 사용하기 위해 throws IOException해줘야함
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(str);
		System.err.println(num);
	}

}
