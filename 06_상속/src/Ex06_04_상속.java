class Person2{
	private String name;
	private int age;

	public Person2() {

	}
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
	}
}


class Employee2 extends Person2{
	private String company;
	private String part;

	public Employee2() {

	}
	public Employee2(String name,int age,String company,String part) {
		super(name,age);
		this.company = company;
		this.part = part;
	}

	public void show() {
		super.show();
		System.out.println("company : "+ company);
		System.out.println("part : "+ part);
	}
}

class Teacher extends Employee2{ //Person2에서 상속받은 Employee2에게 상속받아 Person2도 상속받는다.
	private String subject;

	public Teacher() {

	}
	public Teacher(String name,int age,String company,String part,String subject) {
		super(name,age,company,part); //부모생성자 호출은 맨윗줄에 있어야함
		this.subject = subject;
	}

	public void show() {
		super.show(); //부모 메소드 호출은 어디있든상관없음
		System.out.println("subject : "+ subject);
	}
}

public class Ex06_04_상속 {
	public static void main(String[] args) {

		Person2 p = new Person2("제니",20);
		p.show();

		System.out.println("--------------------------");

		Person2 e = new Employee2("지디",30,"쌍용출판사","인사부");
		e.show();

		System.out.println("--------------------------");
		Person2 t = new Teacher("태연",50,"SM고","생활지도부","음악");
		t.show();

		System.out.println("****************************");

		Person2 arr[] = {
				new Person2("제니",20),
				new Employee2("지디",30,"쌍용출판사","인사부"),
				new Teacher("태연",50,"SM고","생활지도부","음악")
		};

		for(int i=0 ; i<arr.length;i++) {
			arr[i].show();
			System.out.println("--------------------------");
		}

	}

}
