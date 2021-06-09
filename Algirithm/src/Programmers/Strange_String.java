package Programmers;

public String Strange_String(String s) {
	String answer = "";
    int cnt = 0;
    String [] array = s.split(""); //문자열 자르기
    
    for(String ss : array){
        cnt = ss.contains(" ") ? 0 : cnt+1; //해당 문자열이 특정 문자열에 포함되어 있는지 검사. 즉 공백이 있으면 0, 없으면 cnt+1
        answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); //짝수일때(cnt%2==0), 소문자, 아니면 대문자
    }
    return answer;
    }
    return answer;
}
