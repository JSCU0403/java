class Person{
	private String name;
	private int age;

	public Person() {
		System.out.println("Person() 생성자");
	}
	public Person(String name,int age) {
		System.out.println("Person(String name,int age)");
		this.name=name; //부모클래스 내부에서는 private에 접근이 가능하다
		this.age=age;
	}
	public void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
	}
}
class Employee extends Person{
	private String company;
	private String part;

	public Employee() {

	}
	public Employee(String name,int age,String company,String part) {
		super(name,age);
		this.company = company;
		this.part = part;
	}
	
	public void show() { //메서드 오버라이딩 : 부모클래스로 부터 상속받은 메서드의 내용을 자식클래스에 맞게 변경하는것
		super.show();
		System.out.println("회사 : "+company);
		System.out.println("부서 : "+part);
	}
}

class Student extends Person{
	private String school;

	public Student() {
		super(); //매개변수 없는 default 부모의 생성자를 호출
		//자식생성자에서만 부모 생성자를 호출할수있다
		System.out.println("Student() 생성자");
	}
	public Student(String name,int age,String school) {
		super(name,age); //private 접근이 힘들기때문에 매개변수2개를 가진 부모생성자에 대입한다
		System.out.println("Student(String name,int age,String school) 생성자");
		//		this.name = name; 부모클래스를 상속받아도 private는 사용할수없다
		//		this.age = age;
		this.school = school;
	}
	public void show() {
		super.show(); //부모클래스의 show에 접근하여 private
		System.out.println("school : "+school);
	}
}

public class Ex06_03_super {

	public static void main(String[] args) {

		//name = "철수"; x
		Person p = new Person("철수",20);
		p.show();

		System.out.println("------------------");
		Student s = new Student("수영",30,"쌍용고");
		s.show();

		System.out.println("------------------");
		Employee e = new Employee("정국",37,"현대","개발부");
		e.show();

	}

}
/*
오버라이딩의 조건
– 선언부가 같아야 한다.(메서드 이름, 매개변수 타입, 매개변수 개수, 리턴타입)
– 접근제어자를 좁은 범위로 변경할 수 없다. 조상의 메서드가 protected이면, 
범위가 같거나 넓은 protected나 public으로만 변경할 수 있다.
– 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
– 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
*/