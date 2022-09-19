package basic1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해
 * 
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while / do~while
 * 
 * 		5) break / continue
 * 
 * 
 */

public class Ex02_control {

	public static void main(String[] args) {

		String id = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호를 입력해 주세요 >>>");
		id = input.nextLine();			/// 일반적으로 입력후 엔터를 침 	/종료		/엔터를 제외한 입력한 값을 출력해주는 것.
		
		char sung = id.charAt(7);
		System.out.println(sung);
		// sung 변수에 문자가 1이거나 3이거나 9이라면 남자출력
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면이라면 여자출력
		// or 연산자 논리연산자 || -> 요즘은 | 로 많이 처리
		
		
		if (sung == '1' || sung == '3' || sung == '9') {
			System.out.println("남자");
		}else if (sung == '2' || sung == '4' || sung == '0'){
			System.out.println("여자");
		}
		
		
		// 8번째 문자 하나를 받아서 chul 이라는 변수에 저장
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0 이라면 "서울"
		// chul 변수가 1 이라면 "인천/부산"
		// chul 변수가 2 이라면 "경기"
		// chul 변수가 9 이라면 "제주"
		
		String home = null;
		
		switch (chul) {		// 문자, 정수, 문자열
		case '0' : home = "서울";	break;
		case '1' : home = "인천/부산";	break;
		case '2' : home = "경기";	break;
		case '9' : home = "제주";	break;
		}System.out.println(home+ " 출신");
		
		String nai = id.substring(0,2);	// nai = "80"
		System.out.println(nai);
		// 문자열 -> 정수 변환
//		int sunai = (int)nai;
		int sunai = Integer.parseInt(nai);	// sunai = 80
		
		int age = 0;
		
		Calendar c = Calendar.getInstance(); // static // 날짜 
		int year = c.get(Calendar.YEAR);
		
		
		
        if(sung == '1' || sung == '2') {
            sunai += 1900;
        } else if(sung == '3' || sung == '4') {
        	sunai += 2000;
        } else if(sung == '9' || sung == '0') {
        	sunai += 1800;
        }
        age =  year - sunai + 1;
		System.out.println(age);
		
		
		
		
		
		
		
		
	}

}
