class Person{ //Person 클래스 선언 , 주소 출력시 클래스도 같이나옴 - 설계도
	String name; //멤버변수(인스턴스변수)
	int age;
	double height;
	static String nation; //static = 여러 객체에서 공통적으로 관리 가능 = 공유변수

	Person(){
		System.out.println1);
	}
}

public class Ex05_01_클래스 {

	public static void main(String[] args) {

		int a; //자료형
		double b;

		Person man = new Person();//공간(객체)-man 를 만들기-변수선언
		       //내가 정의한 person 클래스를 사용 man.name / man.age;

		man.name = "아이유"; //man 변수 안에는 출력값
		man.age = 30;
		man.height = 170;
		man.nation = "대한민국";

		System.out.println(man);
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(man.nation);

		System.out.println();
		Person woman = new Person(); //다른 주소를 가지는 객체(woman) 생성 = 인스턴스 생성
		woman.name = "이종석";
		woman.age = 40;
		woman.height = 162.3;

		System.out.println(woman);
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(Person.nation); //클래스 Person의 공유변수 nation값 출력

//woman과 man은 참조변수


	}

}
