import com.javastudy.Car; //다른 package com.javastudy의 car.java파일을 불러온다
import java.lang.System; //
import java.util.Date;
//class Car{
//	private int speed;
//	private String direction;
//
//	public Car(int speed,String direction) {
//		this.speed = speed;
//		this.direction = direction;
//	}
//	public void prnCar() {
//		System.out.println("speed : "+speed+"\ndirection : "+direction);
//	}
//
//} //Car

public class Ex06_06_import {

	public static void main(String[] args) {

		Car car = new Car(100,"동남");
		car.prnCar();
		System.out.println(123);
//		=java.lang.System.out.println(123); 패키지를 import해서 가져와서 생략가능
		
		String s = "아이유";
//      =java.lang.String s = "아이유";
		Date d = new Date();
		System.out.println("d : "+d);
	}

}
