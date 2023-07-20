
public class Ex04_04_2차원배열 {

	public static void main(String[] args) {

		int [][] arr = { //1줄=1차원배열 2줄이상=2차원배열
				{11,22,33},
				{44,55,66},
				{13,43,78},
				{34,34,65}
		};
		//참조값(메모리주소)는 항상 4byte - 배열처리 될수있음
		/*
		System.out.println("arr : "+arr);
		System.out.println("arr : "+arr[1]); //1행의 데이터가 나오는게 아닌 참조값(주소)출력
		System.out.println("arr : "+arr[2]);
		System.out.println("arr : "+arr[3]);

		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" "); //0행 1열
		System.out.println(arr[0][2]+" ");

		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println(arr[1][2]+" ");

		System.out.print(arr[2][0]+" ");
		System.out.print(arr[2][1]+" ");
		System.out.println(arr[2][2]+" ");

		System.out.print(arr[3][0]+" ");
		System.out.print(arr[3][1]+" ");
		System.out.println(arr[3][2]+" ");

		System.out.println(arr.length); // 행의 개수
		System.out.println(arr[0].length); //0행의 열의 길이
		System.out.println(arr[1].length); //1행의 열의 길이
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		 */

		for(int i=0 ; i<arr.length;i++) { //행의 길이 만큼 출력
			for(int y=0 ; y<arr[i].length;y++) { //가변배열의 경우 행의 길이만큼 출력
				System.out.print(arr[i][y]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//가변배열 
		int[][] arr3= {
				{12,45,63,52},
				{32,95},
				{95,23,96},
				{34,23,17,95}
		};
		
		for(int[] i : arr3) {
			for(int z : i) {
		System.out.print(z+" ");
			}
			System.out.println();
		}


	}

}
