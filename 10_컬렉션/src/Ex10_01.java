class Top<T>{ //자료형이 정해지지 않았다는걸 알리기 위해 <T> 사용
	private T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData(){
		return data;
	}
}
//중요

public class Ex10_01 extends Top{
	public static void main(String[] args) {

		String str = "Generic 방식";

		Top<String> t1 = new Top<String>();
		t1.setData(str);
		String s1 = t1.getData();
		System.out.println(s1);
		//System.out.println(t1.getData());

		Top<Integer> t2 = new Top<Integer>(); //int불가 Integer로 사용

		t2.setData(123);
		Integer s2 = t2.getData();
		System.out.println(s2);

		Top<Double> t3 = new Top<Double>(); 

		t3.setData(1.1);
		Double s3 = t3.getData();
		System.out.println(s3);


	}//main

}
