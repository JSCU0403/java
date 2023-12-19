
public class Ex05_10_재귀호출 {

	public static void main(String[] args) {
	
		show(3);
	
	}//main
	
	
    static void show (int cnt){
	 System.out.println("Hi~"+cnt);
	 if(cnt == 1)
		 return;
		 show(--cnt);
	 
	 
 }
    
}
