package study.com;

import java.util.Scanner;

public class A_Quiz {

	public static void main(String[] args) {
//		
//		// 백준 10718
//		System.out.println("강한친구 대한육군");
//		System.out.println("강한친구 대한육군");
//		
//// 다른 방법
////		System.out.println("강한친구 대한육군 \n강한친구 대한육군");
//		
//		
//		// 백준 10171
//		// \는 단독으로 출력이 불가능한 문자이므로 백슬래시 + 문자 조합이기 때문에 백슬래시를 두 번 쓰면 된다.
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__
//		
//		// 백준 25083
//		// \, " 이전에 \와 " 앞에 백슬래시를 넣는다. 
//		System.out.println("         ,r'\"7");
//		System.out.println("r`-_   ,'  ,/");
//		System.out.println(" \\. \". L_r'");
//		System.out.println("   `~\\/");
//		System.out.println("      |");
//		System.out.println("      |");				
//		
		// 백준 1000
		// 두 수를 입력받고 합을 출력하는 문제
//		Scanner scanner = new Scanner(System.in);
//		int a,b= 0;
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		System.out.println(a + b);
		
		// 백준 1001
		// 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제
//		Scanner scanner = new Scanner(System.in);
//		int a,b =0;
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		System.out.println(a - b);
		
		// 백준 10998
		// 두 수를 입력받고 곱셈을 한 결과를 출력하는 문제
//		Scanner scanner = new Scanner(System.in);
//		int a,b =0;
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		System.out.println(a * b);
		
		// 백준 1008
		// 두 수를 입력받고 나눗셈을 한 결과를 출력하는 문제
//		Scanner scanner = new Scanner(System.in);
//		double a,b = 0;
//		
//		a = scanner.nextDouble();
//		b = scanner.nextDouble();
//		System.out.println(a / b);
		
		// 백준 10869
		// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//		Scanner scanner = new Scanner(System.in);
//		int a,b = 0;
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
//		
//		scanner.close();
		
		// 백준 10926
		// 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
		// 준하는 놀람을 ??!로 표현한다. 
		// 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
//		Scanner scanner = new Scanner(System.in);
//		String id = scanner.next();
//		System.out.println(id + "??!");
		
		// 백준 18108
		// 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.		
//		Scanner scanner = new Scanner(System.in);
//		int year = scanner.nextInt();
//		
//		System.out.println(year - 543);
		
		// 백준 10430
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//		Scanner scanner = new Scanner(System.in);
//		int a, b, c = 0;
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		c = scanner.nextInt();
//		
//		System.out.println((a + b) % c);
//		System.out.println(((a % c) + (b % c)) % c);
//		System.out.println((a * b) % c);
//		System.out.println(((a % c) * (b % c)) % c);

		// 백준 2588
//		Scanner scanner = new Scanner(System.in);
//		int a = 0;
//		String b = null;
//		
//		a = scanner.nextInt();
//		b = scanner.next();
//		
//		System.out.println(a * (b.charAt(2) - '0'));
//		System.out.println(a * (b.charAt(1) - '0'));
//		System.out.println(a * (b.charAt(0) - '0'));
//	
		
		// 백준 2438
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
