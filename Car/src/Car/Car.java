package Car;

public class Car {
	private String color;
	private int speed = 0;
	private int speedtest;
	private boolean startUp;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int speedDown(int sD) {
		speedtest = speed;
		if(startUp == false) {
			System.out.println("�õ��� ���� �ֽ��ϴ� �õ��� Ų �Ŀ� �ӵ��� �÷��ֽʽÿ�");
			return 0; 
		}else {			
		if(speed == 0) {
			System.out.println("���� �ӵ��� 0km/h �Դϴ�. ");
			return speed; 
		}else {
			speedtest = speed - sD;
			if(speedtest < 0) {
				System.out.println("0km/h ���ϴ� �޸� �� �����ϴ�.");
				return speed;
			}else {
				speed -= sD;
				return speed;
			}
		}
		}
		
	}
	
	public int speedUp(int sU) {
		speedtest = speed;
		if(startUp == false) {
			System.out.println("�õ��� ���� �ֽ��ϴ� �õ��� Ų �Ŀ� �ӵ��� �÷��ֽʽÿ�");
			return 0; 
		}else {			
		if(speed > 100) {
			System.out.println("������ �ִ� �ӵ� 100km/h �Դϴ�.");
			return speed;
		}else {
			speedtest = speed + sU;
			if(speedtest > 100) {
				System.out.println("100km/h �̻��� �޸� �� �����ϴ�.");
				return speed;
			}else {
				speed += sU;
				return speed;
			}
		}
		}
	}
	public void breakPaddle(boolean bp){
		
		if(startUp == false) {
			speed = 0;
			System.out.println("�õ��� �����ֽ��ϴ�.");
			return;  
		}else if(speed > 1){
			System.out.println("�ӵ��� �ٿ��ֽð� �극��ũ�� ��� �ֽʽÿ�");
		}else {			
		startUp = bp;
		System.out.println("�õ��� �������ϴ�.");
		}
	}
	
	public void startPaddle(boolean sP) {
		if(startUp == true) {
			System.out.println("�õ��� �����ֽ��ϴ�.");
		}else {
			this.startUp = sP;
			System.out.println("�õ��� �������ϴ�.");
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + " ������ ������ : " + color + "�̰� ���� �ӵ��� : " + speed + "km/h �Դϴ�." + "]";
	}
}
