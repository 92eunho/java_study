package sample_application;

public class IncreaseOperatorExam {
	/**
	 * 클래스를 실행시키는 특별한 코드
	 * @param agrs
	 */
	public static void main(String[] agrs) {
		
		//스스로에게 1을 더하는 실습
		//일반 연산자
		int num1 = 0;
		num1 = num1 +1;
		//짧은 연산자
		num1 = 0; //초기화, 대할당
		num1 += 1;
		//단항 연산자
		num1 = 0;
		num1++;
		
		
		
		System.out.println(num1++);
		System.out.println(num1++);
		System.out.println(num1++);
		System.out.println(num1);
	
		int num2 =0;
		++num2;
		
		System.out.println(num2);
		System.out.println(++num2);
		System.out.println(++num2);
		System.out.println(++num2);
		System.out.println(num2);
	}
}
