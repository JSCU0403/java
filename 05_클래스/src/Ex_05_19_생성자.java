class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	public Music () {
		title = "분홍신";
		singer = "아이유";
		genre = "발라드";
		price = 1000;
	}
	
	public Music (String title,String singer,String genre,int price) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;		
	}
    
	public void display(){	
		System.out.println("노래제목 : "+title);
		System.out.println("가수 : "+singer);
		System.out.println("장르 : "+genre);
		System.out.println("가격 : "+price);
		System.out.println();
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public String getGenre() {
		return genre;
	}
	public int getPrice() {
		return price;
	}
	
}

public class Ex_05_19_생성자 {
	public static void main(String[] args) {

		Music m1 = new Music(); //생성자를 통한 주입 분홍신 아이유 발라드 1000
		System.out.println(m1.getTitle());
		m1.display();
		
		Music m2 = new Music("사건의 지평선","윤하","댄스",3000); //생성자
		System.out.println(m2.getSinger());
		m2.display();

		Music m3 = new Music(); //setter 주입 : 어머나 장윤정 트로트 5000
		m3.setTitle("어머나");
		m3.setSinger("장윤정");
		m3.setGenre("트로트");
		m3.setPrice(5000);
		
		System.out.println(m3.getPrice());
		m3.display();
		
	}

}
