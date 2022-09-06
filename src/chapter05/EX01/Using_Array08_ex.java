package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08_ex {

	public static void main(String[] args) {
		// 08 강사님 정답
		
		Scanner sc = new Scanner(System.in);
		
		int []arr= new int[10];
		int max = 0;
		int min = 0;
		
		// 스캐너로 임의의 정수값 입력
		System.out.println("정수 입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		//최대값을 뽑아서 max 변수에 저장후 출력
		for (int i = 0; i < arr.length; i++) {		// arr i 번째 방의 값이 max 변수의 값보다 크면 max 변수에 arr[i] 번 방의 값을 max변수에 대입
			if(arr[i]>max) {
			max=arr[i];
			}
		}System.out.println("최대값 : " + max);
		
		//
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}System.out.println("최소값 : " + min);
		
		
	
	}

}
