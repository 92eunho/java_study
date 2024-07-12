package sample_application;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//키보드에서 숫자를 입력받아 변수를 할당하기.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("0보다 크고 100보다 작은 숫자를 입력하고 엔터를 치세요.");
		//keyboard.nextInt();//키보드에서 숫자 입력을 받는 코드
		int firstNumber = keyboard.nextInt();
		System.out.println("방금 입력한 숫자는 " + firstNumber + "입니다");
		
		boolean isGraeterThanZero = firstNumber > 0;
		System.out.println("0보다 큰가? " + isGraeterThanZero);
		
		//3항 연산자
		//조건(불린이 결과) ? true일 때의 처리 : false일때의 처리;
		//0보다 작은 숫자인 경우 "음수입니다" 출력
		//firstNumber가 0보다 큰 경우 "양수입니다"출력
		System.out.println(firstNumber > 0 ? "양수입니다." : "음수입니다.");
		
		//firstNumber가 100보다 작을 경우 "알맞은 숫자입니다."
		//firstNumber가 100보다 클 경우 "너무 큰 숫자입니다."
		System.out.println(firstNumber < 100 ? "알맞은 숫자입니다." : "너무 큰 숫자입니다.");
		
		boolean isLessThanOneHund = firstNumber < 100;
	
		System.out.println("100보다 작은가? " + isLessThanOneHund);
		
		//boolean isVaildNumber = firstNumber > 0 && firstNumber < 100;
		//System.out.println(isVaildNumber);
		
		boolean isVaildThanNumber = isGraeterThanZero && isLessThanOneHund;
		System.out.println("0보다 크고 100보다 작은가? " + isVaildThanNumber);
		System.out.println(isVaildThanNumber ? "알맞은 숫자입니다" : "범위에서 벗어난 숫자입니다 0에서 100사이를 입력하세요");
		
		
		
		
	}
}

