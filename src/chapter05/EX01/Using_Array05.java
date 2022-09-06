package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		
		// 1 ~ 500 까지 3의 배수를 배열에 저장 
		// 출력 : 1. 직접출력, 2. for 출력 3. Enhanced for, 4.toString() 
		// 합계 :		평균 : 
		
		
		
		
		int [] a = new int [166];
		
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}

		
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		
		System.out.println("==== 직접출력 ====");
		System.out.println(a[0]);
		
		System.out.println("==== for 문 사용해서 값을 입력, 출력 ====");
		for (int i = 0, j=3; i < a.length; i++,j+=3) {
			a[i] = j;
			count++;
			System.out.println(j);
		}


		System.out.println("==== 향상된 for 문을 사용해서 출력 ====");
		for (int k :a) {
				System.out.println(k);
			
		}

		
		System.out.println("==== Arrays.toString() 를 사용 ====");
		System.out.println(Arrays.toString(a));
		

		System.out.printf("합계 : %d \t 평균 : %f ",sum,sum/(double)count);
		
		
		
		
		
	}

}
