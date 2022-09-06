package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		
		// 에스프레소, 카페라떼 아포카토 주문할 경우 가격이 3,500원
		// 아메리카노 를 주문할 경우 : 2500원
		// 그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 <변수>는 가격이 <변수> 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 입력해 주세요.>>");
		String order = sc.next();
		int aa = 3500;
		int bb = 2500;
				
		
		if (order.equals("에스프레소")||order.equals("카페라떼")||order.equals("카페라테")||order.equals("아보카도")) {
			System.out.println("주문하신 커피는 "+ order + "이고, 가격은" + aa + "입니다.");
		}else if (order.equals("아메리카노")) {
			System.out.println("주문하신 커피는 "+ order + "이고, 가격은" + bb + "입니다.");
		}else {
			System.out.println("저희 매장에는 없는 메뉴 입니다.");
		}
		
		
		int prise = 0;
		
		if (order.equals("에스프레소")||order.equals("카페라떼")||order.equals("카페라테")||order.equals("아보카도")) {
			prise = 3500;
		}else if (order.equals("아메리카노")) {
			prise = 2500;
		}else {
			System.out.println("저희 매장에는 없는 메뉴 입니다.");
		}
		System.out.printf("주문하신 %s는 가격이 %d원 입니다.",order,prise);
		
		
		sc.close();

	}

}
