class Person{ //extends Object
	private String name;
	private int age;
	private char bloodType;
	
	Person(String name,int age,char blooType){
		super();
		this.name =name;
		this.age = age;
		this.bloodType=blooType;
	}
	
	public boolean equals (Object o) {
		//Object o = new Person("태연",50,'o');
		if(o instanceof Person) {//연산자 instanceof 
//			참조변수를 클래스타입으로 변경 가능한지 물어보는 연산자
			Person p = (Person) o;
			if(this.age == p.age && this.bloodType == p.bloodType) {
				
				return   true;
			}
			else{
				return false;
			}
		}else {
			return false;
		}
	}
}//Person

public class Ex09_02_equals {
	public static void main(String[] args) {
		
		Person p1 = new Person("윤아",30,'a');
		Person p2 = new Person("태연",50,'o');
		
		boolean result = p1.equals(p2);
		System.out.println("result : "+result);
		if(result == true) {
		System.out.println("나이와 혈액형이 같습니다");
		}
		else {
			System.out.println("나이와 혈액형이 같지않습니다");		
		}
		
	}//main
}//Ex09_02
