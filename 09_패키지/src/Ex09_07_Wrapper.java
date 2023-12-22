
public class Ex09_07_Wrapper {
	public static void main(String[] args) {

		Integer it1 = 12;
		Integer it2 = new Integer(12); // 12->new Integer(120 : autoboxing
		
		int it3 = new Integer(21); // new Integer(21) -> 21 : unboxing
		System.out.println(it3);
		
		double d1 = 1.1;
		Double d2 = new Double(1.1);
		Double d3 = 1.1; //autoboxing
		double d4 = new Double(1.1);//unboxing
		
		Integer i2 = Integer.valueOf("100"); //parseInt랑 같음
		Integer j2 = Integer.valueOf("200"); //Integer 타입으로 return (int도 가능)
		System.out.println(i2+j2);
		
		int i = Integer.parseInt("100");//문자열 숫자를 정수로 변경해서 계산하게해줌
		int j = Integer.parseInt("200");//많이씀
		
		double d5 = Double.parseDouble("1.1"); //valueof도 똑같음
		double d6 = Double.parseDouble("2.2");
		System.out.println(d5+d6);
		
	}

}
