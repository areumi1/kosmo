package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수 10개 등록
		// 정수 배열 방 10개를 생성하고 
		// 임의의 값을  10개에 방에 저장
		// 그중 최대값을 뽑아서 출력하는 프로그램을 생성해 보세요.
		// 출력 : 배열방 10개에서 최대값은 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력해 주세요 : ");
		
		
		int a ;
		int []arr = new int [10];

				
		for(int i = 0 ; i < arr.length; i++ ) {
			a = sc.nextInt();
			arr[i]=a;
			}
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0 ; i < arr.length; i++ ) {
			if (arr[i]> max) {
				max = arr[i];
			}
		}System.out.println("최대값 : " + max);
		
		for (int i = 0; i<10; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}System.out.println("최소값 : " + min);
		
		
		System.out.println("== 2번째 방법 Arrays.sort() 메소드를 사용해서 출력 ==");
		Arrays.sort(arr);		// index 배열 방의 값을 정렬을 한다. 0 (최소값),1, 2,3 ........ arr.length -1 ( 최대값)
		System.out.println("최대값 : " + arr[arr.length -1]);
		System.out.println("최소값 : " + arr[0]);
		
		
		System.out.println("==== Stream을 사용하는 경우 ====");
		System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
		
		
		
		
		
		

	}

}
