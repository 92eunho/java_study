package sample_application;

import java.util.Random;

public class Mart {

	public static void main(String[] agrs) {
		
		/*
		 * 내가 가진돈 2000원
		 * 물건 가격이 랜덤!
		 * 
		 * 이 물건을 살 수 있으면 구매 성공! 출력
		 *                 없으면 구매 실패... 출력
		 * 
		 * 살 수 있는 조건 (내가 가진 돈 >= 물건 가격)
		 */
		
		int money = 2000;
		
		//ctrl+shift+O
		//랜덤한 숫자를 가져오는 코드
		Random random = new Random();
		
		int price = random.nextInt(4000); // 0부터 3999중 하나
		//int price = random.nextInt();
		
		System.out.println("내가 가진 돈 : " + money);
		System.out.println("상품의 가격 : " + price);
		
		if (money >= price) {
			System.out.println("구매 성공!");
		}	
		
		else {
			System.out.println("구매 실패...");
		
		}		
		
	}
}
