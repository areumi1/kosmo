package chapter02.EX08;

public class TypeCasting_2 {

	public static void main(String[] args) {
		// 1. 자동 타입 변환 (업캐스팅)
		float value1 = 3 ; 		// int 3이 float 타입으로 자동 업캐스팅
		long value2 = 5;		// int 5가  long 타입으로 자동 업캐스팅
		double value3 = 7;		// int 7이 double 타입으로 자동 업캐스팅
		
		byte value4 = 9;		// 예외 int => byte  캐스팅 없이 진행
		short value5 = 11;		// 예외 int => short 캐스팅 없이 진행
		
		// 2. 수동 타입 변환 (다운캐스팅)
		byte value6 = (byte)128;		// int가 byte타입 안에 있으면 캐스팅 없이 진행되나 범위 밖일시 int => byte 변환
		int value7 = (int)3.5;			// double => int
		float value8 = (float)7.5;		// double => float
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		

	}

}
