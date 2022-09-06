package chapter04.EX04;

public class Using_For04 {

	public static void main(String[] args) {
		
		// 이중 for 문 사용하기(for 문 내부의 for문
		
		for (int i = 0; i < 5 ; i++) {		//5번 반복 	: i가 각각 0, 1, 2, 3, 4 일때 j를 반복실행
			for(int j = 0; j<10; j++) {		//10번 반복 
				System.out.println("i : " + i + ", j : "+ j);
			}
			System.out.println();
		}
		
	
	}

}
