
public class Ex04_01_1차원 {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		System.out.println();


		//제일 많이 쓰임 int[] arr1 = {10,20,30,40,50}; //배열은 자료형(데이터타입) 대괄호 변수명 = 중괄호;
		//별로 안쓰임 int[] arr1 = new int[] {10,20,30,40,50};
		int[] arr1 = new int [5]; //2번째로 많이 쓰임
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		//같은자료형의 변수 여러개를 한묶음으로 묶어서 관리 - 메모리주소가 연속으로 할당됨
		//arr1[0] = 10 arr1[1]=20 배열은 0부터 시작

		int z;
		for (z=0;z<5;z++) {
			System.out.println(arr1[z]);
		}

		System.out.println("방의 갯수 : "+arr1.length); //배열이름.length : 배열의 길이

		int i ;
		//일부요소에 접근할때(전체)
		for(i=0;i<arr1.length;i++) {          //배열의 이름은 참조값		마지막 인덱스번호는 length-1
			System.out.println(arr1[i]);
		}

		System.out.println("arr1:"+ arr1); //배열명(arr1)안에는 메모리주소(참조값)가 들어감 *첫주소만 알면 다음주소를 알수있기때문

		int[] arr2 = {1,2,3};
		System.out.println(arr2);
		int[] arr3 = new int [] {1,2,3};
		System.out.println(arr3);
		int[] arr4 = new int [3];
		System.out.println(arr4);

		System.out.println();
		
		double[] arr5 = {1.1,2.2,3.3};
		for (z=0;z<3;z++) {
			System.out.println(arr5[z]);
		}
		double[] arr6 = new double [] {1.1,2.2,3.3};
		for (z=0;z<3;z++) {
			System.out.println(arr6[z]);
		}
		double[] arr7 = new double [3];
		arr7[0] = 1.1;
		arr7[1] = 2.2;
		arr7[2] = 3.3;
		for (z=0;z<3;z++) {
			System.out.println(arr7[z]);
		}
		System.out.println();
		
		for(double x :arr5){   //확장for문 : 배열 arr5 내부의 값을 변수에 넣고 출력을 반복
			System.out.println(x);
			
		}
		
		for(int y : arr1) { //정수 확장 for 문 : 기존 for문보다 빠르고 간결하다
			System.out.println(y);
		}
		
		
	}

}
