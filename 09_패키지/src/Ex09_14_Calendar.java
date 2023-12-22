import java.util.Calendar;
//protected Calendar() {
//	
//}

public class Ex09_14_Calendar {
	public static void main(String[] args) {

//		Calendar new Calendar(); 같은패키지도 아니고 상속받은 자손클래스도 아니기때문에 접근불가
		String [] week = {" ","일","월","화","수","목","금","토"};
		Calendar cal = Calendar.getInstance();//getInstatnce메서드가 객체만드는데 도움
		System.out.println("cal :"+cal);
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월");//0부터 시작해서 +1
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		//일요일=1 월2 화3 수4 목5 금요일=6 토요일=7
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		int am_pm = cal.get(Calendar.AM_PM);
		if(am_pm == 0 ) {
			System.out.print("오전 ");
		}
		else {
			System.out.print("오후 ");
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour+"시"+minute+"분"+second+"초입니다");
	}

}
//protected 같은패키지면 어디서든 다른패키지는 자손클래스에서만 접근이 가능하다