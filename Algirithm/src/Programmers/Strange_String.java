package Programmers;
//이상한 문자 만들기
//----------------------------------------//
//문제 설명
//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
//각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//각 단어의 짝수번째 알파벳은 대문자로, 
//홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
//solution을 완성하세요.
//
//제한 사항
//문자열 전체의 짝/홀수 인덱스가 아니라, 
//단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
//----------------------------------------//
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
