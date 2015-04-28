package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");
		
		Scanner stdIn=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=stdIn.next();
		System.out.print("나이 : ");
		int age=stdIn.nextInt(); //반드시 정수 입력
		System.out.print("몸무게 : ");
		double weight=stdIn.nextDouble();
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("몸무게="+weight);
		System.out.println("\n영수증 출력 10:31");
		stdIn.close();
	}//main end
}//class END
