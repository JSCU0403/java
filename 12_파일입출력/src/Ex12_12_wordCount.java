import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Ex12_12_wordCount {
	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		FileReader fr;

		fr = new FileReader("lyrics.txt");
		br = new BufferedReader(fr);

		String str;
		int lineCount = 0;
		String lyrics="";//초기값 null로 설정시 null도 포함되서 나옴

		while((str = br.readLine()) != null) { //str값이 null을 읽을때까지 한줄씩 읽기
			System.out.println(str);//읽은 데이터에는 엔터가없다 엔터앞까지만 읽기
			lineCount++;
			lyrics += str+" ";
		}

		System.out.println("lineCount : "+ lineCount);
		System.out.println(lyrics);

		String[] arr = lyrics.split(" ");
		//StringTokenizer나 Scanner로도 사용 가능
		System.out.println("전체 단어 갯수 : "+arr.length);
		
		System.out.println("----");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) == null) { //map의 배열 i번째가 null이면 1로 초기화
				map.put(arr[i],1);
			}
			else {
				Integer v = map.get(arr[i]);//map에서 얻은 배열 i번째의 값을 v에 넣는다
				map.put(arr[i], v+1); //map의 arr[i]의 값v에 1을 더한다
			}
			
		}
		Set<String> words = map.keySet(); //set은 순서가없는 중복허용x
		for(String word : words) { 
			System.out.println(word+":"+map.get(word));
		}
		
		System.out.println("중복 제거 갯수 : "+words.size());// =map.size()
		
		

	}

}

//throws 처리시 close를 반드시 써야함
//단어와 단어사용수를 체크하기 위해서는 map을 사용한다
//반복문으로 i를 출력하면서 나오면 value에 +1을 한다