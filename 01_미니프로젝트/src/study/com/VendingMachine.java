package study.com;

import java.util.Scanner;

public class VendingMachine {
	
	// 메뉴는 4개, 4개 중 선택(문자열 입력)
	// 4개가 아닌 다른 메뉴를 입력하면 존재하지 않는 메뉴임을 알림
	// 금액 입력 > 메뉴 선택 > 메뉴가 있는 경우 메뉴가 나오고 거스름돈 출력
	// 금액 입력 > 메뉴 선택 > 메뉴가 없는 경우 존재하지 않는 메뉴 , 거스름돈 출력

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int money, change = 0; // 자판기에 넣은 금액, 메뉴 선택, 잔돈
		String choice = null;
		int coke = 1200; // 콜라
		int sprite = 1000; // 사이다
		int water = 500; // 생수
		int coffee = 2000; // 커피
		int fiveThousandWon, oneThousandWon, fiveHundredWon, oneHundredWon = 0; // 거스름돈 : 오천원, 천원, 오백원, 백원
		
		// 금액 넣기
		System.out.print("금액을 입력하세요 >> ");
		money = sc.nextInt();
		
		// 메뉴 선택
		System.out.print("<메뉴> \n 콜라 / 사이다 / 생수 / 커피 >> ");
		sc.nextLine();
		choice = sc.nextLine();
		
		// 메뉴 선택 후 거스름돈 계산 및 돈이 부족한지 확인
		if (choice.equals("콜라")) {
			if(money >= coke) {
			change = money - coke;
			System.out.printf("%s가 나왔습니다.", choice);}
			else {
				change = money;
				System.out.println("돈이 부족하여 구매가 불가능합니다.");
			}
		} else if (choice.equals("사이다")) {
			if(money >= sprite) {
				change = money - sprite;
				System.out.printf("%s가 나왔습니다.", choice);}
				else {
					change = money;
					System.out.println("돈이 부족하여 구매가 불가능합니다.");
				}
		} else if (choice.equals("생수")) {
			if(money >= water) {
				change = money - water;
				System.out.printf("%s가 나왔습니다.", choice);}
				else {
					change = money;
					System.out.println("돈이 부족하여 구매가 불가능합니다.");
				}
		} else if (choice.equals("커피")) {
			if(money >= coffee) {
				change = money - coffee;
				System.out.printf("%s가 나왔습니다.", choice);}
				else {
					change = money;
					System.out.println("돈이 부족하여 구매가 불가능합니다.");
				}
		} else {
			change = money;
			System.out.println("존재하지 않는 메뉴입니다. 메뉴를 다시 입력하세요..");
		}
		
		// 메뉴 및 거스름돈 출력
		System.out.println();
		System.out.println("거스름돈 >> " + change + "원");
		
		fiveThousandWon = change / 5000;
		oneThousandWon = change % 5000 / 1000;
		fiveHundredWon = change % 5000 % 1000 / 500;
		oneHundredWon = change % 5000 % 1000 % 500 /100;
		System.out.println("오천원 >> " + fiveThousandWon + "개");
		System.out.println("천원 >> " + oneThousandWon + "개");
		System.out.println("오백원 >> " + fiveHundredWon + "개");
		System.out.println("백원 >> " + oneHundredWon + "개");
		System.out.println("어려워");
	}

}
