package Programmers;
//정소 제곱근 판별
//-----------------------------------------------------//
//문제 설명
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
//n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//제한 사항
//n은 1이상, 50000000000000 이하인 양의 정수입니다.
//-----------------------------------------------------//
public class sqrt_pow {
	public long solution(long n) {
        long answer = 0 ;
        
        //sqrt는 math를 import 해야한다. (루트를 씌우는 함수)'
        //pow는 거듭제곱할때 사용. pow(5,2)는 5의 제곱
        if((int)Math.sqrt(n) == Math.sqrt(n))
            answer = (int)Math.pow((Math.sqrt(n)+1),2);
        else
            answer = -1;
        return answer;
    }
}
