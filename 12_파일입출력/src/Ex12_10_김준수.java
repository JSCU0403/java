import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Ex12_10_김준수 {
	public static void main(String[] args) throws IOException  {
		int selectnum; //번호선택
		String words,means,word;//단어+뜻,의미,단어이름
		Scanner sc = new Scanner(System.in);
		FileWriter fw;
		FileReader fr ;
		BufferedWriter bw = null;
		BufferedReader br = null;
		boolean flag = false;
		
		HashMap<String,String> voca = new HashMap<String,String>();

		while(true) {
			System.out.print("1.단어입력 2.단어검색 3.종료\n>>");
			selectnum = sc.nextInt();

			if(selectnum == 1) {
				System.out.print("단어/뜻 입력>>");
				br = new BufferedReader(new InputStreamReader(System.in));
				words = br.readLine();
				fw = new FileWriter("voca.txt", true);
				bw = new BufferedWriter(fw);
				bw.write(words + "\n");
				
				word = words.substring(0, words.indexOf("/"));
				means = words.substring(words.indexOf("/")+1);

				voca.put(word, means);
				
				
				continue;
			}//if문

			if(selectnum == 2) {

				System.out.print("검색 단어 입력>>");
				br = new BufferedReader(new InputStreamReader(System.in));
				words = br.readLine();
				fr = new FileReader("voca.txt");
				br = new BufferedReader(fr);
				//파일 읽어오기
				String line;
				
				while( (line = br.readLine()) != null ) {
					flag = false;
					String[] tokens = line.split("/");
					if(tokens[0].equals(words)) {
						System.out.println("단어>"+tokens[0]);
						System.out.println("단어의 뜻>"+tokens[1]);
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("찾는 단어 없음");
				}
				
				
//				if(voca.get(words)==null) { 
//					System.out.println("찾는 단어 없음");
//				}
//				else {
//					System.out.println("단어>"+ words);
//					System.out.println("단어의 뜻>"+voca.get(words));
//				}

				continue;
			}//if문

			if(selectnum == 3) {
				System.out.println("프로그램을 종료합니다");
				bw.close();//throws로 할때 반드시 넣어야함
				br.close();
				
				System.exit(0);//0: 정상종료 1:비정상종료
			}//if문

		}//while문


	}//main

}
//1.단어입력 단어검색 종료
//>>1
//단어/뜻 입력>> "단어/뜻"입력 (공백도 포함가능)
//입력반복
//검색할 단어이름을 입력 단어이름과 뜻 출력
//없으면 찾는 단어 없음 출력