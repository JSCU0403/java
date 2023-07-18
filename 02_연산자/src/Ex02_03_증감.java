
public class Ex02_03_증감 {

	public static void main(String[] args) {
		//++,-- (증감연산자)
	int a=5,b=5,aa,bb; //변수 설정시에 ,반점을 이용해서 여러가지 한꺼번에 설정가능
	System.out.println("a="+a); 
	//a=a+1
	//	a += 1;
	//	a++; //1씩으로만 증가 
	++a; //증감연산자만 단독 사용시에는 상관없지만 대입연산자가 있을경우 앞,뒤에 따라 출력되는 값이 바뀜
	System.out.println("a="+a); 
	 
	a=5;
	System.out.println("a="+a); 
	
	aa = ++a;
	System.out.println("a="+a+",aa="+aa); 
	
	a=5;
	System.out.println("a="+a); 
	
	aa = a++; //(a++)증감연산자가 뒤에 붙으면 값을 출력시킨 후에 값이 증가한다  (++a)앞에 붙으면 값이 증가한후에 출력시킨다
	System.out.println("a="+a+",aa="+aa); 
	
	int i = 10;
	System.out.println(i);
	System.out.println(i++);  //단독으로 쓰였지만 결과를 콘솔창에 띄우는 System.out 명령어는 대입연산자가 존재하는것처럼 동작한다. 출력후+1
	System.out.println(++i);  //따라서 증감연산자의 위치에 따라 출력되는 값이 달라진다  +1후 출력
	System.out.println(++i);  //+1후 출력
	System.out.println(i++);  //출력후 +1
	System.out.println(i);    //출력

	int q = 10;
	System.out.println(q);  //10
	System.out.println(q--);  //10
	System.out.println(--q);  //8
	System.out.println(--q);  //7
	System.out.println(q--);  //7
	System.out.println(q);    //6

	
	}


}
