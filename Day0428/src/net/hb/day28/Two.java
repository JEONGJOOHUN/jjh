package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");
		
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�̸� : ");
		String name=stdIn.next();
		System.out.print("���� : ");
		int age=stdIn.nextInt(); //�ݵ�� ���� �Է�
		System.out.print("������ : ");
		double weight=stdIn.nextDouble();
		System.out.println("�̸�="+name);
		System.out.println("����="+age);
		System.out.println("������="+weight);
		System.out.println("\n������ ��� 10:31");
		stdIn.close();
	}//main end
}//class END
