import java.util.ArrayList;
import java.util.Scanner;

// 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성
//---------------------------------------------------------//
 /*조건
  student 클래스 생성
  string name,no를 가지고있다.(학번,이름)
  
  학생을 저장한후 ArrayList에 저장후
  y를 누르면 계속 검색.
  n를 누르면 프로그램 종료\
  
  학생 이름이 있는 경우 그 학생의 학번을 출력, 없는 경우 없는 학생이름이라고 출력*/
//---------------------------------------------------------//
public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인스턴스 생성
		Student st1 = new Student("철수","1111");
		Student st2 = new Student("영희","1112");
		Student st3 = new Student("바둑","1113");
		
		ArrayList <Student>list = new ArrayList();//<>은 제너릭
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		
		//foreach문법
		//list를 처음부터 끝까지 순회를 하는데, 그때마다 stu변수에 첫번째 참조변수-> 두번째 참조변수..등 stu가 가르킨다.
		//---------------------------------------------------------//
		for(Student stu :list) { //오른쪽 컬렉션에 참조형 변수를 사용한다.
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		//---------------------------------------------------------//
		
		Scanner sc = new Scanner(System.in);
				
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료하시려면 n을 입력해주세요.");
			String input = sc.next();
	
			if(input.equals("y")) {
				System.out.println("학생이름을 입력하세요.");
				String name = sc.next();
				System.out.println("검색을 시작합니다.....");
				
				boolean flag = false;
						
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
			}
			else if(input.equals("n")) {
				
				break;
			}
			else
				System.out.println("잘못입력 하셨습니다. 다시입력해주세요.");
				continue;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
