package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지 방법으로 출력
		
		String[] s = new String[5];
		
		s[0] = "이순신";
		s[1] = "세종대왕";
		s[2] = "박혁거세";
		s[3] = "광개토대왕";
		s[4] = "온조왕";
		
		System.out.println("======== 1 ======== ");
		
		System.out.println(s[0]);
		
		System.out.println("======== 2 ======== ");
		
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("======== 3 ======== ");
		
		for(String k : s) {
			System.out.println(k);
		}
		
		System.out.println("======== 4 ======== ");
		
		System.out.println(Arrays.toString(s));

	}

}
