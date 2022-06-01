package study.com;

import java.util.Scanner;

public class B_VariableQuiz {
	
	public void method1() {
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
//		String name = null;
//		char gender = '\u0000';
//		int age = 0;
//		double height = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("이름을 입력하세요 : ");
//		name = scanner.nextLine();
//		
//		System.out.print("나이를 입력하세요 : ");
//		age = scanner.nextInt();
//		
//		System.out.print("성별을 입력하세요(남/여) : ");
//		gender = scanner.next().charAt(0);
//		
//		System.out.print("키를 입력하세요(cm) : ");
//		height = scanner.nextDouble();
//		
//		System.out.printf("키 %.1f인 %d살 %c %s님 반갑습니다^^", height, age, gender, name);
	}
	
	public void method2() {
		// 키보드로 정수 두개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
//		int a = 0;
//		int b = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		a = scanner.nextInt();
//		
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		b = scanner.nextInt();
//		
//		System.out.println("더하기 결과 : " + (a + b));
//		System.out.println("빼기 결과 : " + (a - b));
//		System.out.println("곱하기 결과 : " + (a * b));
//		System.out.println("나누기 결과 : " + (a / b));
	}
	
	public void method3() {
		// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		// * 참고 (면적 = 가로*세로 , 둘레 = (가로+세로) *2)
//		double a = 0;
//		double b = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("가로 : ");
//		a = scanner.nextDouble();
//		
//		System.out.print("세로 : ");
//		b = scanner.nextDouble();
//		
//		System.out.println();
//		System.out.println("면적 : " + (a * b));
//		System.out.println("둘레 : " + ((a + b) * 2));
	}
	
	public void method4() {
		// 영어 문자열 값을 키보드로 입력 받아 앞의 문자 세개를 출력하세요.
		String str = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		str = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("첫 번쨰 문자 : " + str.charAt(0));
		System.out.println("두 번쨰 문자 : " + str.charAt(1));
		System.out.println("세 번쨰 문자 : " + str.charAt(2));
	}
}
