package study.com;

import java.util.Scanner;

public class B_VariableQuiz2 {
	
//	public void method1() {
//		// 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.
//		
//		char ch = '\u0000';
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("문자 : ");
//		ch = scanner.nextLine().charAt(0);
//		
//		System.out.println(ch + " unicode : " + (int)ch);
//	}
		
		
	public void method2() {
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		// 이 때 총점과 평균은 정수형으로 처리 하세요.
		
		double korscore = 0;
		double engscore = 0;
		double mathscore = 0;
		int sum = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 : ");
		korscore = scanner.nextDouble();
		
		System.out.println("영어 : ");
		engscore = scanner.nextDouble();
		
		System.out.println("수학 : ");
		mathscore = scanner.nextDouble();
		
		sum = (int)(korscore + engscore + mathscore);
		avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	
	}

}
