class Car1 {
	 Car1name name;
	 String color;

	static class Car1name { //static 내부 클래스
		static String model; 
		int year;
		Car1name(String model, int year) {//"프라이드", 2005
			this.model = model;
			this.year = year;
		}
		Car1name(){
			
		}
		
	} // static inner의 끝

	Car1(String model, int year, String color) {
		//"프라이드", 2005, "파랑"
		this.name = new Car1name(model,year);
		this.color = color;
		//this.model=model; car1이 아닌 car1name의 내부변수라 불가능
	}
	Car1(){
		
	}
	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}//Car1클래스의 끝

public class Ex08_01_staticInner {
	public static void main(String[] args) {
		Car1 pride = new Car1("프라이드", 2005, "파랑");
		pride.OutInfo(); // 모델 = 프라이드, 년식 = 2005, 색상 = 파랑
		System.out.println(pride.color);
		System.out.println(pride.name.model);//name클래스의 model
		System.out.println(pride.name.year);
		System.out.println();
		
		Car1 pride2 = new Car1();
		System.out.println(pride2.name.model);   
		
		System.out.println("=====================");
		
		Car1.Car1name sonata = new Car1.Car1name("소나타", 2023); //static변수에 접근하듯이 클래스.내부클래스로 객체만들어야한다 Car1name()x
		System.out.printf("모델 = %s, 년식 = %d\n", sonata.model,sonata.year);
		// 모델 = 소나타, 년식 = 2023

		Car1.Car1name sonata2 = new Car1.Car1name();
		System.out.printf("모델 = %s, 년식 = %d\n", sonata2.model,sonata2.year);
	}
}

