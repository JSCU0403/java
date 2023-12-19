class Student3 {
	private String name;
	private int kor,eng,math;

	public void display() {
		System.out.println(name+","+kor+","+eng+","+math);
	}

	public Student3() {
		name = "써니";
		kor = 10;
		eng = 20;
		math = 30;
	}

	public Student3(String name) {
		this.name = name;
		kor = 50;
		eng = 50;
		math = 59;
	}

	public Student3(String name,int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


}
public class Ex_05_21_객체배열 {

	public static void main(String[] args) {//생성자를 통한 주입 display로 출력
		
		int[] a = {1,2,3}; //int 3개를 배열로 만든것
		double[] b = {1.1,2.2,3.3,4.4};
		int[] c = new int[3];
		
		Student3 s  = new Student3();	//써니 10 20 30
		s.display();
		Student3 s1 = new Student3("태연");	//태연 50 50 59
		s1.display();
		Student3 s2 = new Student3("윤아",70,80,90);	//윤아 70 80 90
		s2.display();
		
		System.out.println("---------------------------------------");
		
		Student3[] arr = new Student3[3]; //배열 3 칸에 참조값(주소)가 들어감 
		arr[0] = new Student3(); // arr[0] = s 이미 만들어져있는 주소를 넣을수도 있음
		arr[1] = new Student3("태연"); // arr[1] = s1
		arr[2] = new Student3("윤아",70,80,90); //arr[2] = s2
		/*
		Student3[] arr1 = {
				 		  new Student3(),
				          new Student3("태연"),
				          new Student3("윤아",70,80,90);
		}
		*/
		for(int i=0;i<arr.length;i++) { //참조변수3개를 배열로 만듦 = 객체배열
			arr[i].display(); //배열로 만들면 반복문으로 쓸수있다
		}
		
		for(Student3 g : arr) {
			g.display();
		}

	}

}
