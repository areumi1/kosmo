package basic1;

public class Ex02_ShortDircuitLogic2 {

	public static void main(String[] args) {

		
		int a = 3;
		
		if( a > 3 & ++a > 3) {
			System.out.println("조건만족");		// false
		}System.out.println("a=" + a);			// 3
		
		if (a >1 | ++a > 3) {
			System.out.println("조건만족2");		// true
		}System.out.println("a=" + a);			// 3

	}

}
