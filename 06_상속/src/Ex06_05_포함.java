class Person3 {
	private String name;
	int age;

	public Person3() {

	}
	public Person3(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
}//Person3

class Worker /*extends Person3*/{
	Person3 p; //Worker 공간 내부에 Person3을 상속이 아닌 주소만 포함시킨것
	String job;
	
	public Worker(String name,int age,String job) {
		p = new Person3(name,age);
		this.job = job;
	}
	public void display() {
		System.out.println("name"+p.getName()); //다른 클래스의 객체
		System.out.println("age"+p.age); //다른 클래스의 객체
		System.out.println("job"+job); //현재 클래스의 객체
	}
}//Worker

public class Ex06_05_포함 {
	public static void main(String[] args) {
		Worker w = new Worker("슈가",70,"가수");
		
		
	}

}
