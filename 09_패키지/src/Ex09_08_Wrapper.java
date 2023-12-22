import java.util.StringTokenizer;

public class Ex09_08_Wrapper {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("합계 : "+sum);
		
		String[] num2 = {"1","2","3","4","5"};
		
		int sum1=0;
		StringBuffer sum2 = new StringBuffer("");
		String sum3="";
		for(int i=0;i<num2.length;i++) {
			sum1 += Integer.parseInt(num2[i]); //valueof로 대체가능
			sum2 = sum2.append(num2[i]);

		}
		System.out.println("합계 : "+sum2);
		System.out.println();
		System.out.println("합계 : "+sum1);
		
		String[] str = {"웬디:70","아이유:90","크리스탈:30"};//콜론의 위치를 찾고 다음점수 출력 합
		int sum4=0;
		for(int i=0;i<str.length;i++) {
			int index = str[i].indexOf(":"); //int index에 배열 str의 i번째에 콜론 위치확인
			System.out.println(index);//콜론의 위치 출력
			
			sum4 += Integer.parseInt(str[i].substring(index+1)); //콜론다음거부터 끝까지 문자열을
		                  //숫자로 바꿔서 sum4에 더하기
		}
		System.out.println("합계 : " + sum4);
		
		System.out.println();
		
		
		int sum5 = 0;
		for(int i=0;i<str.length;i++) {
			String[] str = str[i].split(":");
			sum5 += Integer.parseInt(arr[1]);
		}
		
		
		System.out.println("합계 : " + sum5);
		
	
	}

}
