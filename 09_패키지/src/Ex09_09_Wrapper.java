
public class Ex09_09_Wrapper {
	public static void main(String[] args) {

		String[] str = {"231","78","1.234","97"};
		
		
		for(int i=0;i<str.length;i++) {

			try{
				int k = Integer.parseInt(str[i]);
				System.out.println(k);
			}
			catch(NumberFormatException n){ //catch 발생시 위로 돌아가지않음
				System.out.println("정수 변환 불가능");
			}
		}
		
	}//main

}
