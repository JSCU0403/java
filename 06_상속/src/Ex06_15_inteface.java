interface Tv{
	void viewTv();
}
interface Camera{
	public abstract void takePhoto();
}
interface Music{
	void playMusic();
}

class Shape2{
	private int size;
	private String color;
}

class Phone extends Shape2 implements Tv,Camera,Music{
	private int size;
	private String color;
	
	public Phone() {
		
	}
	
	public Phone(int size,String color) {
		this.size = size;
		this.color = color;
//		System.out.println("사이즈 : "+size);
//		System.out.println("color : "+color);
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	
	public void viewTv() {
		System.out.println("tv를 본다");
	}
	
	public void takePhoto() {
		System.out.println("사진찍는다");
	}
	
	public void playMusic() {
		System.out.println("음악듣는다");
	}
}
public class Ex06_15_inteface {
	public static void main(String[] args) {

		Phone p = new Phone(7,"blue"); //사이즈 7 color blue 출력
		System.out.println("사이즈 : "+p.getSize());
		System.out.println("color : "+p.getColor());
		p.viewTv(); //tv를 본다
		p.takePhoto(); //사진찍는다
		p.playMusic(); //음악듣는다
		
		
	}

}
