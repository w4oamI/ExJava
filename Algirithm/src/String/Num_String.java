package String;
import java.util.*;
public class Num_String {
	public static boolean fun(String s) {
		boolean answer = true;
		
		char [] array = s.toCharArray();
		if(array.length != 4 && array.length != 6 ) {
			return false;
		}
		for(int i=0;i<array.length;i++ ) {
			if(!(array[i] >= '0' && array[i]<='9')) {
				answer = false;
				return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean a =fun(s);
		System.out.println(a);
	}

}
