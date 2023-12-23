import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public String toString(){
		return title+","+singer+","+price;
	}
	
}
public class Ex10_04_ArrayList {
	public static void main(String[] args) {

		int i ;
		String retry;
		Music m1 = new Music("가나다","버즈",5000);
		Music m2 = new Music("라마바","신화",1000);
		Music m3 = new Music("아자차","윤하",10000);
		
		ArrayList<Music> arr = new ArrayList<Music>();
		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
//
//		Music [] arr = {
//						new Music("ditto","newjeans",11000),
//						new Music("일어나","김광석",5000),
//						new Music("Goodbye","소녀시대",8000)
//					};
//		
//		int i;
//		String retry;
//		
//		ArrayList<Music> list= new ArrayList<Music>();
//		for(i=0; i<arr.length; i++) {
//			list.add(arr[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("제목 : ");
			String title = sc.next();
			
			System.out.print("가수명 : ");
			String singer = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			Music input = new Music(title,singer,price);
			arr.add(input);
			
			System.out.println("계속?");
			retry = sc.next();
			if(retry.equals("n")){
				break;
			}
		}
		
		
		
		System.out.print(arr);
		System.out.println();
		for(i=0;i<arr.size();i++) {
			Music m = arr.get(i);
			System.out.println(m.getTitle());
			System.out.println(m.getSinger());
			System.out.println(m.getPrice());
			System.out.println();
		}
		
		for ( Music m : arr ) {
			System.out.println(m.getTitle());
			System.out.println(m.getSinger());
			System.out.println(m.getPrice());
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
