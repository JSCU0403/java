class Member{
	private String id;
	private String pw;
	public Member(){ //생성자 return을 하지않으며 void를 사용하지않는다.
		System.out.println("Member () 생성자");
		id = "park";
		pw = "9876";
	}	
	public Member(String id,String pw) { //생성자 오버로딩
		System.out.println("Member(String id,string pw)");
		this.id = id;//mb3의 id
		this.pw = pw;
	}	
	public Member(String id) { //생성자 오버로딩
		System.out.println("Member(String id)");		
		this.id = id;
		this.pw = "9876"; //pw는 이자리에서 초기화한다
	}
    public void setId(String a){
		this.id = a; 
	}
	public void setPw(String b) {
		this.pw = b;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
}
public class Ex_05_18_생성자 {
	public static void main(String[] args) {
		Member mb1 = new Member();
		mb1.setId("kim"); //메서드 호출
		mb1.setPw("1234"); //출력
		
		System.out.println("id = "+ mb1.getId());
		System.out.println("pw = "+ mb1.getPw());
		
		Member mb2 = new Member();
		
		mb2.setId("jung");
		mb2.setPw("3333");
		System.out.println(mb2.getId());
		System.out.println(mb2.getPw());

		Member mb3 = new Member("hong","7777");
		
		System.out.println(mb3.getId());
		System.out.println(mb3.getPw());
		
		Member mb4 = new Member("choi");
		
		System.out.println(mb4.getId());
		System.out.println(mb4.getPw());
		
		System.out.println("===================");
		
		Member[] Mem = new Member[4];
		Mem[0] = mb1;
		Mem[1] = mb2;
		Mem[2] = mb3;
		Mem[3] = mb4;
		for(int i=0;i<Mem.length;i++) {
			System.out.println("id : "+Mem[i].getId()+" pw : "+Mem[i].getPw());
			System.out.println();
		}
		
	}
	
	
}
