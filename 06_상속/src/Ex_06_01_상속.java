class Sports{ // 부모클래스
	private String name; // 스포츠
	private int inwon; // 10

	public Sports() {
		name = "스포츠";
		inwon = 10;
	}

	public Sports(String name, int inwon) {
		this.name = name;
		this.inwon = inwon;
	}

	public void display() {
		System.out.println(name+","+inwon);
	}
} //Sports

class Baseball extends Sports{ // class 자식클래스명 extends 부모클래스명
	//	String name; 
	//	int inwon;
	private double ta;
	public Baseball() {
//		name = "야구";
//		inwon = 9;
		super("야구",9);
		ta = 0.567;
	}
	public Baseball(String name, int inwon, double ta) {
		//this.name = name;
		//this.inwon = inwon;
		super(name,inwon);
		this.ta = ta;
	}

	public void display() {
		//System.out.println(name+","+inwon+","+ta);
		super.display();
		System.out.println(ta);
	}
}//Baseball

class Football extends Sports{
	//	String name; 
	//	int inwon;
	private int goal;

	public Football() {
//		name ="축구";
//		inwon = 11;
		super("축구",11);
		goal = 3;
	}

	public Football(String name, int inwon, int goal) {
		//this.name = name;
		//this.inwon = inwon;
		super(name,inwon);
		this.goal = goal;
	}

	public void display() {
		//System.out.println(name + "," + inwon + "," + goal);
		super.display();
		System.out.println(goal);
	}

}//Football

public class Ex_06_01_상속 {

	public static void main(String[] args) {
		Sports s = new Sports();
		//		s.name="스포츠";
		//		s.inwon=10;
		//		System.out.println("이름 : "+s.name+"\n인원 : "+s.inwon);

		Sports s2 = new Sports("스포츠",10);
		s2.display();

		System.out.println("--------------------------------");	

		Baseball b = new Baseball();
		//		b.name="야구";
		//		b.inwon=9;
		//		b.ta=0.567;
		//		System.out.println("이름 : "+b.name+"\n인원 : "+b.inwon+"\n타율 : "+b.ta);

		Baseball b2 = new Baseball("야구",9,0.567);
		b2.display();

		System.out.println("--------------------------------");

		Football f = new Football();
		//		f.name="축구";
		//		f.inwon=11;
		//		f.goal=2;
		//		System.out.println("이름 : "+f.name+"\n인원 : "+f.inwon+"\n골 : "+f.goal);

		Football f2 = new Football("축구",11,3);
		f2.display();
		
		System.out.println("*************************");
		Sports s3 = new Sports("스포츠",10);
		Sports b3 = new Baseball("야구",9,0.567);
		Sports f3 = new Football("축구",11,3);
		
		Sports arr [] = {
				new Sports(),
				new Baseball(),
				new Football()
		};
		
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
			System.out.println("--------------------------------");
		}
		
	}//main
	

}
