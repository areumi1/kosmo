package chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {
	
	static int add (int [] a) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴 
		int sum = 0;
		for (int i =0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
//	static int div (int [] a) {
//		// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
//		int sum = 0;
//		for(int i =0;i<a.length;i++) {
//			sum -= a[i];
//		}
//		return sum;
//	} 틀린값
	
	static int div (int [] a) {
		// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int div = 7;
		for(int i =0;i<a.length;i++) {
			if (i == 0) {continue;}	// i==0 일때는 아래 내용 실행하지 않고 
			div -= a[i];	
		}
		return div;
	}
	
	
	static long mul (int[] a) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long sum = 1;
		for(int i =0;i<a.length;i++) {
			sum *= a[i];
		}
		
		return sum;
	}
	

	static double avg (int [] a) {
		// 들어온 배열의 모든 값의 평균값을 리턴
		int sum = 0;
		for(int i =0;i<a.length;i++) {
			sum += a[i];
	
		}
		return sum / (double)a.length;
	}

	public static void main(String[] args) {
		// 1~ 100까지 7의 배수만 저장후 각 메소드 호출
		
		// 배열의 7의 배수를 저장
		int a[] = new int [14];
		//int [] arr1 = new int [100/7] << 강사님
		for (int i=0,j = 7; i < a.length; i++ ,j += 7) {
			a[i] = j;
		}
		
		// if
		int b[] = new int [100/7];
		
		int count = 0;
		for(int i =0;i<b.length;i++) {
			if (i %7 == 0) {
				b[count]=i;
				count++;
			
			}
		}
		System.out.println("============");
		// 배열의 각 방의 내용을 출력
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("==================");
		
		//메소드 호출 : add(a)
		int sum = add(a);
		System.out.println("배열의 모든값을 더합값 : " +add(a));
		
		//메소드 호출 : div(a)
		int div = div(a);		// 변수명과 메소드 명은 같아도 사용법이 다르기때문에 상관 없음
		System.out.println("배열의 모든값을 뺀값 : " + div(a));
		
		//메소드 호출 : mul(a)  	int 범위를 넘는다. ===> long
		long mul = mul(a);
		System.out.println("배열의 모든값을 곱한 값 : " + mul(a));
					// int : 1760012288
					// long : 4513787149822699520
		
		//메소드 호출 : avg(a)
		double avg = avg(a);
		System.out.println("배열의 모든의 평균 값 : " + avg(a));
		

	}

}
