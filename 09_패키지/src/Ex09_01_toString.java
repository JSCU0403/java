class Student{ //extends Object
	private String name;
	private int hakbun;

	public Student(String name, int hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}

	public String toString() { //오버라이딩해서 주소출력을 이름과 학번출력으로 변경
		return name+"/"+hakbun;
	}
	
	public boolean equals (Object obj) {//Object 앞에 this가 숨어있다. this는 s1 obj는 s2
    //Object obj =(Object)new student ("슈가",2000) - 다형성 부모가 자식타입공간을 가지고 있어도 부모가 물려준거만 접근
	//업캐스팅된 부모타입변수 obj가 student를 받아도 변수가 없어서 Object obj를 Student obj로 바꾸거나 다시 다운캐스팅
		System.out.println(obj instanceof Student);
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return this.hakbun == s.hakbun && this.name.equals(s.name); //문자열은 ==대신 equals사용
		}
		else {
			return false;
		}
	}
}//Student

public class Ex09_01_toString {
	public static void main(String[] args) {
		Student s1 = new Student("정국",2000);
		Student s2 = new Student("정국",2000);
		
//		System.out.println(s1.str());
//		System.out.println(s2.str());
		
		System.out.println(s1.toString()); //부모클래스의 toString은 문자의 주소
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s2);
		
		boolean result = s1.equals(s2); //s2는 obj가 받고 s1=(this)
		System.out.println("result : "+result ); //s1과 s2의 주소값 비교 같으면 true 다르면 false
	}
}

//모든 클래스는 object 클래스를 상속함
//object.toString 의 기능 : 문자의 주소
/*
• 디폴트 toString()은 객체의 형과 객체 고유의 번호를 리
턴하는 메서드이다.(앞 예제참고)
• 객체.toString(); // 객체의 형과 @과 객체 고유번호를
16진수로 리턴
• 객체자체의 값을 출력해도 위의 객체.toString() 했을 때
와 같은 결과 출력됨(앞 예제 참고)
객체변수 참조만 해도 toString이 자동호출됨
• 보통 toString()은 재정의해서 사용한다

public String toString() 기능 : 
public boolean equals(Object obj) :
Object obj = new Student()
*/