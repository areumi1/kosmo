package chapter02.EX02;

public class NamingVirableAndConstant {
	public static void main(String[] args) {
	
		/* 변수의 이름 부여 : 변수 : 값을 변경 가능
		 	- 변수이름은 영문, 한글 사용가능 (권장사항이 아님)
		 	- 첫자는 소문자
		 	- 특수문자 : _, $ 외 입력 불가
		 	- 첫자에 숫자는 올수 없음 (오류남)
		 	- JAVA의 Keyword(예약어)는 올수 없다. (int, double, String....) 
		 	 */ 
		
		boolean aBcD;			// aBcD 변수에 true, false 값만 입력가능 (아닐시 오류)
		aBcD = true;
		System.out.println(aBcD);
		aBcD = false;
		System.out.println(aBcD);
		byte 가나다; 		// 사용은 가능 하나 권장 사항이 아님
		short _abcd;	// 특스문자는 _ , $ 사용가능
		char $ab_cd;	
		double main;	// 사용방법이 달라서 메소드이름을 변수 이름으로 사용 가능
		//float int;	// 예약어를 변수 명으로 사용하면 오류 발생 
						// class, int, double, char, byte////
		String myClassNane;		//첫단어는 소문자, 여러 단어가 있을때 첫단어 대문자
		
		
		/*
		   상수의 이름 부여 : 상수 : 값을 변경 불가능
		    - 대문자로 처리
		    - 변수 선언문 앞에 final 키워드를 사용 
		    - 변경 불가능한 변수를 상수라 함.
		 */
		
		final double PI;
		PI = 3.141592;
		
		System.out.println(PI);
		
		//PI = 1234.00 ;		// 상수는 값을 수정할 수 없다. 
		System.out.println(PI);
				
		final int MY_DATA ; 	//상수일때는 여러단어가 있을때 _로 처리 (규칙)
		int myDats ;			//변수 첫단어는 소문자, 여러 단어가 있을때 첫단어 대문자
		
		
		
		
	} 

}
