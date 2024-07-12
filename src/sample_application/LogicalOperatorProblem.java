package sample_application;

import java.util.Scanner;

public class LogicalOperatorProblem {

	public static void main(String[] agrs) {
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("첫번째 수를 입력하세요.");
		int num1 = keyboard.nextInt();
	
		System.out.println("두번쨰 숫자를 입력하세요");
		int num2 = keyboard.nextInt();
	
		System.out.println("둘중에 큰 수인 " + (num1 > num2 ? num1 : num2) + "를 출력합니다");
	
		int biggistNumber = num1 > num2 ? num1 : num2;
	
	}
}