package Programmers;

public class xton_num {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution(2, 5);
	}
	private static void solution(int x, int n) {
		// TODO Auto-generated method stub
		long[] answer = new long[n];
        answer[0]=n;
        
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]+x;
        }
        
        return;
	}

}
