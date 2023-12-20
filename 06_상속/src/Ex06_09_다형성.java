class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}//Animal

class Dog extends Animal {
	public void bark() {
		System.out.println("멍멍");
	}
}

public class Ex06_09_다형성 {
	public static void main(String[] args) {
		
		int i = (int)3.7; //double(8) -> int(4) 다운캐스팅 : 수동으로 직접 변환
		double j=3;       //int(4) -> double(8) 업캐스팅 : 자동으로 변환
		
		System.out.println(i);
		System.out.println(j);
		
		Dog d = new Dog();
		d.bark();

		Animal a = new Animal();
		a.bark();

		Animal d2 = (Animal) d; //Dog(자식) -> Animal(부모) 업캐스팅(자동)-(Animal은 생략가능)
 		d2.bark();

 		//d = (Dog) a; //Dog는 자식타입 Animal은 부모타입 부모->자식 = 다운캐스팅 (Dog)가 생략되어있음
 		d = (Dog) d2; //업캐스팅이 되있는 d2를 대입
 		d.bark(); //업캐스팅의 흔적이 없으므로 출력시에 오류
	
	}

}
