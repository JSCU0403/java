
public class Ex04_06_2차원 {

	public static void main(String[] args) {
		
		int[][] arg = {
				{1,2,3,4},
				{5,6,7,8}
		};
		
		for (int i=0 ; i<arg.length;i++) {
			for(int y=0 ; y<arg[i].length; y++) {
				System.out.print(arg[i][y]+" ");
			}
			System.out.println();
		}
		
		/*
		 많이씀
		 int[][] arr = new int[][]{
		 
		 }
		 */
		
		/* 많이 사용함 
		 int[][] arr1 = new int [2][4];
		 arr[0][0]=1;
		*/
		
		System.out.println();
		
		//확장for문
		for(int[] x : arg) { 
			//int[] x = {1,2,3,4}
			//int[] x = {5,6,7,8}
			for(int y : x) { //행마다 접근
				System.out.print(y+" ");
				}
			System.out.println();
		}
		
		
		
		
	}

}
