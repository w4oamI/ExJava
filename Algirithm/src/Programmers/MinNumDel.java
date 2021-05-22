package Programmers;

public class MinNumDel {
	public int[] solution(int[] arr) {
	    //배열이 빈 배열일 경우 -1을 리턴
	        //-----------------------------------//
	        if(arr.length==1){
	        int[] answer = {-1};
	            return answer;
	        }
	        //-----------------------------------//
	        
	        //작은수를 제외하기 때문에 배열 크기가 -1된다.
	        int [] answer = new int [arr.length-1]; 
	        int min=0;
	        
	        //작은수를 판별(작은수가 어느 index에 있는지 확인)
	        //-----------------------------------//
	        for(int i=0;i<arr.length;i++){
	            if(arr[min]>arr[i]){
	                min=i;  
	            }
	        }
	        //-----------------------------------//
	        
	        //중간에 작은수가 껴있을 경우.
	        //-----------------------------------//
	        for(int i=min+1;i<arr.length;i++){
	            arr[i-1] = arr[i];
	        }
	        //-----------------------------------//
	        
	        //arr로 받은 배열을 answer에 다시 정렬
	        //-----------------------------------//
	        for(int i=0;i<answer.length;i++){
	            answer[i]=arr[i];
	        }
	        //-----------------------------------//
	        return answer;
	    }
}
