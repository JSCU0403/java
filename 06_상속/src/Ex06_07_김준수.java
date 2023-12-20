class Sports2{
	private String name; // 스포츠
	private int inwon; // 10
	
	public Sports2(){
		
	}
	public Sports2(String name,int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("inwon : "+inwon);
	}
}

class Baseball2{
	//Sports2를 포함
	Sports2 s;
	private final double ta;
	
	public Baseball2() {
		this.ta = 0;
		
	}
	public Baseball2(String name,int inwon,double ta) {
		s = new Sports2(name,inwon);
		this.ta = ta;
	}
	
	public void display() {
		s.display();
		System.out.println("ta : "+ta);
	}
}

public class Ex06_07_김준수 {
	public static void main(String[] args) {
		
		Sports2 s = new Sports2("스포츠",10);
		s.display();
		
		System.out.println("-------------------------");
		
		Baseball2 b = new Baseball2("야구",9,0.567);
		b.display();
		
	}

}
