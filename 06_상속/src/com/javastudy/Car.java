package com.javastudy;

import java.util.Date; //import는 CTRL + shift + O 를 누르면 자동으로 import완성

//Car

public class Car {
	private int speed;
	private String direction;

	public Car(int speed,String direction) {
		this.speed = speed;
		this.direction = direction;
	}
	public void prnCar() {
		System.out.println("speed : "+speed+"\ndirection : "+direction);
		System.out.println("----------------");
		Date d = new Date();
		System.out.println(d);
		System.out.println("----------------");
	}
}

/* private : 오직 만든 선언클래스에서만 접근가능
 default : 같은 패키지 내에서만 가능
protected : 같은 패키지내에서 가능 다른패키지의 상속받은 클래스까지 가능
public : 어디서나 접근가능

*/