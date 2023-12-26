import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_11_Scanner {
	public static void main(String[] args) throws FileNotFoundException {

//				Scanner sc = new Scanner(System.in);
		//스캐너로 입력받을때는 바이트입력받는 System.in도 한글입력 받을수있다.
		Scanner sc;
		int num,sum=0,cnt=0;
		
		sc = new Scanner(new File("file.txt")).useDelimiter(",");
		//System.in이 아닌 파일도 입력받을수있다./ 구분자 ,를 만나면 끊어라
		
		while(sc.hasNextInt()) {//sc에 다음 출력할 정수가있다면 참
			num = sc.nextInt();
			System.out.println(num);
			sum += num;
			cnt++;
		}
		
		System.out.println("sum"+sum);
		System.out.println("avg"+(double)sum/cnt);
	}

}
