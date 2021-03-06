# ExJava
Java Study
자바 알고리즘 공부

아직 Interview-Question와 연결이 안되어 있기 때문에 여기에 작성해둔다.   

#이전에 공부해놓은 Interview-Question 작성.   

Interview-Question.  
//----------------------------------------------------------------//   


[클러스터 인덱스와 넌클러스트 인덱스].  
//----------------------------------------------------------------//.  
클러스터 인덱스.  
1. 하나의 테이블에 한개만 생성이 가능하다.   
2. 조회는 빠르지만, 수정 삽입 삭제는 느리다.   
3. 물리적으로 행을 재배열한다.   
4. 인덱스 페이지 용량이 넌클러스터 보다 작다.   
   
넌클러스터 인덱스.  
1. 하나의 테이블의 여러개 생성이 가능하다.   
2. 조회는 느리지만, 수정 삽입 삭제가 빠르다.   
3. 물리적으로 재배열을 하지 않는다.   
4. 인덱스 페이지 용량이 클러스터 인덱스 보다 크다.   
//----------------------------------------------------------------//.  
   
[Http와 Https].  
//----------------------------------------------------------------//.  
어떠한 요청을 웹 브라우저가(클라이언트) 웹 서버에 무언인가 요청을 할 때 사용하는 프로토콜이다.   
   
http.  
1. 서버/클라이언트 모델을 따라 데이터를 주고 받기 위한 프로토콜.  
2. 80번 포트를 사용하고, 클라이언트의 요청도 80번 포트로 보낸다.   
   
Https.  
1. Http에 데이터 암호화를 추가한 프로토콜이다.   
2. SSL인증서를 사용한다.   
3. 433번 포트를 사용하고, 공개키 암호화를 지원한다.   
   
SSL인증서는 사용자가 사이트에 제공하는 정보를 암호화 하고,    
TLS(전송계층 보안)프로토콜을 통해서도 보안을 유지한다. TLS는 데이터 무결성을 보장하기 때문에 데이터가 도중에 수정 및 손상을 방지하고, 사용자가 사신이 의도하는 웹사이트와 통신하고 있다는 것을 입증하는 인증 기능도 제공한다.   
   
=>Http는 보안에 취약한 반면 Https는 안전하게 데이터를 주고 받을 수 있다. 하지만 Https는 암호화와 복호화 과정이 필요하기 때문에 Https보다 속도가 느리다. (요즘은 거의 차이가 나지 않는다.) 또한 Https는 인증서를 발급하고 유지하기 위해 추가 비용이 발생한다.   
//----------------------------------------------------------------//.  
   
   
[Session 과 Cookie].  
//---------------------------------------------------------------//.  
사용이유 : HTTP프로토콜의 특징이자 약점을 보호하기 위해 사용한다.   
   
HTTP 프로토콜의 특징.  
비연결지향 : 요청하고, 응답을 한 후에 연결을 끊는 특정이 있다.   
상태없음 : Connection을 끊는 순간 클라이언트와 서버의 통신이 끝나며 상태 정보는 유지하지 않는다.   
   
=> 비연결지향이기 때문에 서버 리소스 낭비가 줄어든다는 장점이 있지만, 통신을 할때마다 새로운 커넥션을 만들어야 하기 때문에 클라이언트 쪽에서는 상태를 유지를 위해 통신 할때마다 어떤 절차를 거쳐야한다.   
즉, 세션 및 쿠키가 없다면 다른 페이지로 넘어갈때마다 인증을 다시 받아야 한다.   
   
쿠키(Cookie).  
클라이언트 로컬에 저장되는 key와 value이 들어있는 작은 데이터 파일.  
이름,값,만료날짜/시간,경로 정보 등이 들어있다.   
   
-세션 쿠키 : 브라우저 메모리에 저장되므로 브라우저가 종료되면 쿠키는 사라진다.(만료 날짜/시간).  
-지속 쿠키 : 파일로 저장되므로 브라우저가 종료되어도 쿠키는 남아있게 된다.(XXX 만료 날짜/시간 XXX).  
   
세션(Sesstion).  
서버에 클라이언트의 상태 정보를 저장하는 기술로 논리적인 연결을 세션이라고 한다.   
웹 서버에 클라이언트의 정보를 저장하고, 클라이언트에게 구분을 위한 ID를 부여하는데 이것이 세션이다.   
   
차이점.  
저장 위치 : 쿠키는 클라이언트의 메모리 또는 파일, 세션은 서버 메모리에 저장된다.   
보안 : 쿠키는 로컬에 저장되기 때문에 변조, 탈취 위험이 있지만, 세션은 서버에 있어 비교적 안전하다.   
   
//---------------------------------------------------------------//.  
   
   
   
[MVC패턴].  
//---------------------------------------------------------------//.   
사용자 인터페이스로부터 비즈니스 로직을 분리하여 애플리케이션의 시각적 요소나 그 이면에서 실행되는 비즈니스 로직을 서로 영향 없이 쉽게 고칠 수 있는 애플리케이션을 만들 수 있다.   
1. Model - 백그라운드에서 동작하는 로직을 처리한다. (데이터를 가진 객체, 파라미터로 주로 쓰인다.) , DB의 테이블과 대응하는 경우가 많다.   
2. View - 사용자가 보게 될 결과 화면을 출력한다. (HTML,CSS,Javascsript를 모아둔 컨테이너).  
3. Controller - 사용자의 입력처리와 흐름 제어를 담당한다. (사용자가 접근한 URL에 따라서 사용자의 요청사항을 파악 후, 그 요청에 맞는 데이터를 Model에 의뢰하고, 데이터를 View에 반영하여 사용자에게 알려준다.)
MVC 패턴 특징  - 전체적인 구조에 관련된 패턴으로 도메인(비즈니스)과 UI로직을 분리하여 유지보수를 독립적으로 수행할 수 있게 한다.   
//---------------------------------------------------------------//.  
   
   
[생명주기].  
//---------------------------------------------------------------//.  
*순간. 멍해져 간단한 질문이었지만, 대답을 하지 못했다.   
-SDLC는 개발과 유지보수 등에 필요한 작업들을 체계적으로 정리한 방법론이다.   
   
※생명주기 순서※.  
 계획 -> 분석 -> 설계 -> 구현 -> 테스트 -> 유지보수.  
 //---------------------------------------------------------------//.  
 
 
 
 [Opencv를 이용하면서 CUDA를 사용한 방법].  
 //---------------------------------------------------------------//.  
 *이부분도 대답을 제대로 하지 못했다. cuDNN이 갑자기 생각이 나지 않았다..   
 *모든것이 끝나고 생각이 났다.. 아래 대답은 개인적인 대답이기 때문에 자세한건 더 공부를 해야한다.   
 *개인적인 대답이지만, 해당 방법이 정확하다.   
    
 사용방법은 되게 간단하다. (사용은 편하지만 사용을 하기 이전 환경설정 하는것이 되게 힘들다.).  
 일단 NVIDIA그래픽에 맞는 CUDA를 설치하였다.   
 Tensorflow를 사용할 예정이 었기 때문에 Tensorflow에 호환이 되는 Cuda,cuDNN을 설치하고,    
 이어서 cmake를 이용하여 opencv빌드 옵션을 설정하여 pycham에서 opencv빌드를 진행하였다.   
    
 ＃cmake : 빌드 도구로 플렛폼에 독집적인 환경을 제공하고, 컴파일 과정을 제어할수 있도록 하는 크로스플렛폼이다.   
 ＃cuDNN : 딥러닝연산을고려하는 하드웨어가 나오면 그것을 뒷바침해주는 딥러닝 기반의 소프프웨어있어야 하는데, cuDNN은 그러한 라이브러리이다.   
 //---------------------------------------------------------------//.  
    
    
    
 [CUDA(GPU)에서 병렬 처리하는 방법].  
 //---------------------------------------------------------------//.  
 *프로젝트 완성에 급급하여 제대로 공부를 못한것이 실수였다.   
 *이제는 한번 공부하는 내용은 100%는 아니더라도 이해와 숙지가 필요할것 같다.   
    
 CUDA는 C/C++언어로 병렬계산에 필요한 기능을 제공해주는, NVIDIA에서 제공하는 소프트웨어이다.   
    
 CPU와 GPU의 기본적인 차이를 우선 알아보아야 한다.   
 1. GPU는 CPU와는 달리 코어가 아주 많다.   
 2. CPU는 복잡한 계산을 빠르게 처리하지만 모두 직렬로 처리한다.   
 3. GPU는 간단한 계산을 빠르게 처리할 수 있고, 많은 연산을 병렬로 동시에 처리한다.   
   
위를 풀면 CPU는 시스템 자원을 제어하고, 복잡한 명령을 처리하기 때문에 다양한 구성요소가 존재하지만, GPU는 그래픽처리를 위해 만들어진 장치이기 때문에.  
단순한 연산을 고속으로 처리가 가능했다. 그렇기 때문에 GPU는 단독으로 시스템 자원을 활용 할수가 없어, CPU의 제어가 필요하다.   
   
그럼 이제 병렬처리하는 방법을 알아보자.  
1. 병렬처리할 데이터를 MAIN MEMORY에서 GPU MEMORY로 이동을 시킨다.   
2. CPU는 GPU에게 GPU MEMORY에 있는 데이터를 가지고 연산을 하라고 제어(명령)한다.   
3. GPU는 CPU가 명령령한 연산처리를 병렬로 수행한다.   
4. GPU가 작업을 마치며녀 GPU MEMORY에 결과를 저장하고, 다시 MAIN MEMORY에 결과를 업로드한다.   
5. 마지막으로 CPU가 MAIN MEMORY에 접근해 해당 결과물을 이용하여 작업을 마무리한다.   
//---------------------------------------------------------------//.  

[딥러닝 GD 와 SGD]   
//---------------------------------------------------------------//.  
*이부분은 예전에 들어는 봤으나, 제대로 학습이 안된 부분이어서 대답을 하지 못했다.   
   
GD와SGD를 알아보기 전에 이것이 무엇인지 알아야 한다.   
기존 뉴럴 네트워크는 weight parameter를 최적화(optimize)하기 위해 GD방법을 사용하였다.   
즉, 위의 GD와 SGD는 옵티마이저 종류중 하나이다.   
GD(gradient Descent)   
- 모든 자료를 다 검토하여 내 위치의 산기울기를 계산하여 방향을 찾는다.(full batch)   
- 한번에 모든 Data set을 Training을 한다.   
   
SGD(Stochastic Gradient Descent)   
- 전부 다 봐야하는 한걸음(GD)은 너무 오래 걸려 조금만 보고 빨리 판단 한다.(mini-batch)   
- 같은 시간에 더 많이 간다.   
- 한번 볼때 일부 Data Set을 보고, 일부만 Training한다.   
//---------------------------------------------------------------//.  
   
   
[CUDA스레드와 일반 스레드 차이]   
//---------------------------------------------------------------//.   
기본적으로 GPU와 CPU의 코어는 다른 구조를 가지고 있다.
GPU는 코어갯수 * 코어 클락으로 이루어져 있다.   
   
CPU는 멀티 코어를 구성하는 전체 요소로, CPU에서 하나의 칩당 멀티 코어로 4~12개 정도의 코어를 가지고 있다.   
   
GPU는 구성요소를 멀티 프로세서 라고 한다. 그 구성요소중 계산 유닛이 존재하는데, 그것을 GPU의 코어 라고한다.   
GPU는 하나의 칩당 최대 15개의 멀티 프로세서를 가지고 있고, 이 멀티 프로세서 안에는 192개의 코어(계산 유닛)을 가지고 있다.   
그렇기 때문에 15 * 192인 2880개의 코어를 가지고 있다.
//---------------------------------------------------------------//.  
   
[메모리 구조]   
//---------------------------------------------------------------//.    
메모리 구조에 크게 4가지 영역이 존재한다.
1. 코드(code) 영역   
2. 데이터(data) 영역   
3. 스택(stack) 영역   
4. 힙(heep) 영역   

첫번째 코드(code) 영역   
실행할 프로그램의 코드가 저장되는 영역으로 텍스트 영역이라고도 부른다.   
CPU는 코드 영역에 저장된 명령어를 하나씩 가져가 처리한다.   

두번째 데이터(data) 영역   
프로그램의 전역 변수와 정적(Static)변수가 저장되는 영역이다.   
데이터 영역은 프로그램의 시작과 함께 할당되며, 프로그램이 종료되면 소멸한다.   

세번째 스택(stack) 영역   
함수 호출과 관계되는 지역변수와 매개변수가 저장되는 영역이다.   
LIFO방식에 따라 동작하며 메모리의 높은 주소에서 낮은 주소의 방향으로 할당 된다.   

네번째 힙(heap)영역   
사용자가 직접 관리하고 해야만 하는 영역이다.
사용자에 의해 동적으로 할당되고 해체된다. 그리고 낮은 주소에서 높은 주소의 방향으로 할당 된다.   
//---------------------------------------------------------------//.  
   
[자료구조]   
//---------------------------------------------------------------//.  
*여기서도 실수가 있었다. 많이 긴장을 하고, 빨리 대답을 해야할 거 같은 부담에 힙과 큐를 헷갈려 말했다..   
*데크는 생각조차 나지 않았다.   
1. 스택 Stack   
- LIFO구조이다.   
- PUSH로 넣고, POP으로 꺼낸다.   
- 한쪽으로만 데이터를 넣고 꺼낸다.   

2. 큐 Queue   
- FIFO구조이다.   
- 한방향으로만 데이터를 넣고, 꺼낼수가 있다.(스택과는 다르다.)   
- Rear에서 Enqueue로 넣고, Front에서 Dequeue로 꺼낸다.   
   
3. 힙 Heap   
- 특정한 규칙을 가지는 트리이다.   
- 트리구조와 배열로 모두 구현 가능하다.   
- 우선사항이 고려된 이진트리 이다.   
- Root에 가장 큰것을 놓고, 자식 노드에는 작은 것을 놓는다.   

4. 덱 Deque   
- 양쪽 방향으로 넣고 꺼낼 수 있다.   
- 스택과 큐의 특성을 모두 가지고 있어 덱을 스택과 큐 모두로 활용할 수 있다.   
- 양방향 연결 리스트로 구현한다.   
//---------------------------------------------------------------//.  
   
//---------------------------------------------------------------//.  
