package Input;
import java.util.*;
import java.util.Scanner;
public class Input_scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		String input = sc.next();
		int num = Integer.parseInt(input);//문자열을 숫자로 변환
		System.out.println(num);
	}

}
