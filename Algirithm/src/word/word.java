package word;
import java.util.*;
public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String a = sc.next();
		 String b = sc.next();
		 int[] cntA = new int[26];
		 int[] cntB = new int[26];
		 char[] arrA = a.toCharArray();
		 char[] arrB = b.toCharArray();

		 if (arrA.length == arrB.length) {
		  for (int i = 0; i < arrA.length; i++) {
		   cntA[arrA[i] - 'a']++;
		   cntB[arrB[i] - 'a']++;
		  }
		  int i;
		  for (i = 0; i < 26; i++) {
		   if (cntA[i] != cntB[i]) {
		    System.out.println("fail");
		    break;
		   }
		  }
		  if (i == 26) {
		   System.out.println("true");
		  }
		 } 
		 else {
		  System.out.println("fail");
		 }
	}

}
