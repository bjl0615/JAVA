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
			System.out.println("시동이 꺼져 있습니다 시동을 킨 후에 속도를 올려주십시요");
			return 0; 
		}else {			
		if(speed == 0) {
			System.out.println("지금 속도는 0km/h 입니다. ");
			return speed; 
		}else {
			speedtest = speed - sD;
			if(speedtest < 0) {
				System.out.println("0km/h 이하는 달릴 수 없습니다.");
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
			System.out.println("시동이 꺼져 있습니다 시동을 킨 후에 속도를 올려주십시요");
			return 0; 
		}else {			
		if(speed > 100) {
			System.out.println("지금은 최대 속도 100km/h 입니다.");
			return speed;
		}else {
			speedtest = speed + sU;
			if(speedtest > 100) {
				System.out.println("100km/h 이상은 달릴 수 없습니다.");
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
			System.out.println("시동이 꺼져있습니다.");
			return;  
		}else if(speed > 1){
			System.out.println("속도를 줄여주시고 브레이크를 밟아 주십시요");
		}else {			
		startUp = bp;
		System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	public void startPaddle(boolean sP) {
		if(startUp == true) {
			System.out.println("시동이 켜져있습니다.");
		}else {
			this.startUp = sP;
			System.out.println("시동이 켜졌습니다.");
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + " 차량의 색상은 : " + color + "이고 현재 속도는 : " + speed + "km/h 입니다." + "]";
	}
}
