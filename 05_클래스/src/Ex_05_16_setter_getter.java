class Person2{
	private String name; //private 외부에서 접근불가
	private int age;
	private double height;
	
	void setName(String n){ //set 이후 첫문자는 대문자로 작성
		this.name = n; //멤버변수 name에 넣기 this.변수이름- 현재 클래스 안의 멤버변수에 접근하는 명령어
	}
	public void setAge(int n){ //메서드는 보통 public을 붙임
		age = n;
	}
	void setHeight(double n){
		height = n;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){ //get은 매개변수없이 return만함
		return age;
	}
	
	public double getHeight(){
		return height;
	}
}
public class Ex_05_16_setter_getter {

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		p.setName("이승기");
		p.setAge(40);
		p.setHeight(178.3);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
		/* p.name = "이승기";
		p.age = 40;
		p.height = 178.3;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
	    */
	
	}

}
