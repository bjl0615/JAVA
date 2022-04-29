package Main;

import java.util.Scanner;

import Car.Car;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		while(true) {
			System.out.println("[   1.�õ� �ѱ�   2.�õ� ����   3.���� ���   4.�극��ũ ���   5.���� �ӵ� Ȯ��   6. �� ���� �Է�   7.�� ���� ����]");			
			int choice = Integer.parseInt(sc.nextLine());
			int exel;
			boolean paddle;
			switch(choice) {
			case 1 : 
				paddle = true;
				car.startPaddle(paddle);
				break;
			case 2 :	
				paddle = false;
				car.breakPaddle(paddle);
				break;
			case 3 :
				System.out.println("���� �ӵ��� �Է����ּ��� : ");
				exel = Integer.parseInt(sc.nextLine());
				car.speedUp(exel);
				break;
			case 4 :
				System.out.println("���� �ӵ��� �Է����ּ��� : ");
				exel = Integer.parseInt(sc.nextLine());
				car.speedDown(exel);
				break;
			case 5 :
				System.out.println("���� �ӵ��� : " + car.getSpeed() + "km/h�Դϴ�.");
				break;
			case 6 :
				System.out.println("���� ������ �Է����ּ��� : ");
				String color = sc.nextLine();
				System.out.println("���� ������ : " + color + "�� �Դϴ�.");
				break;
			case 7 :
				System.out.println(car.toString());
			}
			
			
		}
	}
}
