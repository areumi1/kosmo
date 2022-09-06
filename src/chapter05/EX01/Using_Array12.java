package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		// 1~ 1000 까지 배열(arr)에 저장후 출력

		// 1. 배열선언
		int arr [] = new int [1000];
		
		// 2. [입력] for 문을 사용해서 arr 배열 변수에 값을 할당
		for (int i =0;i <arr.length; i++) {
			arr[i] = i + 1;
		}
		// 3. [출력] for 문을 사용해서 arr 배열 변수의 값을 출력
		for (int i =0;i <arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("===========");
		// 4. [출력] 향상된 for문 사용해서 출력
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
		System.out.println("===========");
		// 5. Arrays.toString(arr) 출력
		System.out.println(Arrays.toString(arr));
		
		
	}

}
