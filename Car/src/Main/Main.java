package Main;

import java.util.Scanner;

import Car.Car;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		while(true) {
			System.out.println("[   1.시동 켜기   2.시동 끄기   3.엑셀 밟기   4.브레이크 밟기   5.현제 속도 확인   6. 차 색상 입력   7.차 정보 보기]");			
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
				System.out.println("밟을 속도를 입력해주세요 : ");
				exel = Integer.parseInt(sc.nextLine());
				car.speedUp(exel);
				break;
			case 4 :
				System.out.println("줄일 속도를 입력해주세요 : ");
				exel = Integer.parseInt(sc.nextLine());
				car.speedDown(exel);
				break;
			case 5 :
				System.out.println("현재 속도는 : " + car.getSpeed() + "km/h입니다.");
				break;
			case 6 :
				System.out.println("차의 색상을 입력해주세요 : ");
				String color = sc.nextLine();
				System.out.println("차의 색상은 : " + color + "색 입니다.");
				break;
			case 7 :
				System.out.println(car.toString());
			}
			
			
		}
	}
}
