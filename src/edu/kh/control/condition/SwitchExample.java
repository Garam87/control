package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in); 
	/*
	 * switch문
	 * -식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 * [작성법]
	 * 
	 * switch(조건식) {
	 * 
	 * 	case 결과값1 : 수행코드1; break;
	 * 	case 결과값2 : 수행코드2; break;
	 * 	case 결과값3 : 수행코드3; break;
	 *	...
	 *  default : case를 모두 만족하지 않을 경우 수행하는 코드(==else)
	 * 
	 * }
	 * 
	 */
	
	public void ex1() {
		// 키보드로 정수를 입력 받아
		// 1 이면 "빨강색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력

		System.out.println("정수입력: ");
		int input = sc.nextInt();
		
		String result;
		
		switch(input) {
		
		case 1 : result = "빨강색";
			break;
		case 2 : result = "주황색";
			break;
		case 3 : result = "노란색";
			break;
		case 4 : result = "초록색";
			break;
		default : result = "흰색";
		}	
		System.out.println(result);
	}

	public void ex2() {
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		String season;
		
		switch(month) {
		
		case 1 : case 2 : case 12 : season = "겨울";
			break;
		case 3 : case 4 : case 5 : season = "봄";
			break;
		case 6 : case 7 : case 8 : season = "여름";
			break;
		case 9 : case 10 : case 11 : season = "가을";
			break;
		default : season = "잘못입력 하셨습니다";
		
			
		}
		
		System.out.println(season);
		
	}

	public void ex3() {
		//연산자(+ - * / %)
		//정수 1 : 5
		//정수 2 : 10
		//연산자 : *
		//계산결과 : 5 * 10 = 50
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력해주세요(+ - * / %) : ");
		String op = sc.next();
		
		int sum;
		
		switch(op) {
		
		case "+" : System.out.printf("%d + %d = %d\n",
				   num1, num2, num1 + num2);
			break;
		case "-" : System.out.printf("%d - %d = %d\n",
				   num1, num2, num1 - num2);
			break;
		case "*" : System.out.printf("%d * %d = %d\n",
				   num1, num2, num1 * num2);
			break;
		case "/" :
			if(num2 == 0) {
				System.out.println("0으로 못나눔");
			} else {
				System.out.printf("%d / %d = %d\n");
			}
			break;
		case "%" : System.out.printf("%d % %d = %d\n",
				   num1, num2, num1 % num2);
			break;
		default  : System.out.println("숫자를 입력해주세요");
		
		}
		System.out.println();
	}
}
