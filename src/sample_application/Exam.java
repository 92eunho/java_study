package sample_application;

public class Exam {

	public static void main(String[] args) {
		
		final int ONE_MINUTES = 60;
		
		int minutes = 5;
		int seconds = 50;
		
		int time = minutes * ONE_MINUTES + seconds;;
		
		System.out.println(time);
		
		
		//2
		int processTime = 145;
		minutes = 0;
		seconds = 0;
		
		minutes = processTime / ONE_MINUTES;
		seconds = processTime % ONE_MINUTES;
		
		System.out.println(minutes + "minutes " + seconds + "seconds ");
				
		//3
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = (celsius * 9/5) + 32; 
		
		System.out.println("섭씨 " + celsius 
							+ "도를 화씨로 변환하면 화씨 " 
							+ fahrenheit + "도입니다." );
		
	}
	
}
