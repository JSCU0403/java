import java.io.File;

public class Ex12_01_File {

	public static void main(String[] args) {
		
		File f1 = new File("C:\\sun\\abc.txt"); //구분자는 \두개
		//File f2 = new File();
		
		String a = File.pathSeparator;
		char b = File.pathSeparatorChar;
		String c = File.separator;
		char d = File.separatorChar;
		
		File f2 = new File("c:"+File.separator+"sun"+File.separator+"abc.txt"); //f1과 동일
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		File f3 = new File("C:\\Sun","abc.txt");
		
		File f4 = new File("c:\\sun");
		
		File f5 = new File(f4,"abc.txt");
		
		System.out.println(f1.length()); //엔터는 길이 2
		System.out.println(f2.length()); 
		System.out.println(f3.length()); 
		System.out.println(f5.length());
	}

}
