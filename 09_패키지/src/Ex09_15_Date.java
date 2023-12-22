import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_15_Date {
	public static void main(String[] args) {

		Date now = new Date();//여러 패키지에 있을수있음
		System.out.println("now : "+now.toString());//toString 오버라이딩되있음
		
		String [] week = {"일","월","화","수","목","금","토"};
		System.out.println(now.getYear()+1900+"년"); //Date.getYear 기준은 1900년
		System.out.println(now.getMonth()+1+"월");
		System.out.println(now.getDate()+"일");
		System.out.println(now.getDay()+"요일");//일요일0 금요일이 5 토요일6 
		System.out.println(week[now.getDay()]+"요일");
	
		SimpleDateFormat sdf,sdf2,sdf3;
		sdf = new SimpleDateFormat("YY-MM-d일 E요일"); //날짜의 형식지정 클래스
		System.out.println(sdf.format(now)); //yy년도 뒷자리2개 mm월 d는 날짜 E요일 a는 오전오후
		
		sdf2 = new SimpleDateFormat("yyyy/MM/DD/E hh:mm:ss a");
		System.out.println(sdf2.format(now)); //y는 대소문자 구별x m은 구별 dd구별x E는 대문자만
		
		sdf3 = new SimpleDateFormat("yyyy년 MMM월 dd일");
		System.out.println(sdf3.format(now));//format()내부에는 Date만 넣어야한다
		
		
	}

}
