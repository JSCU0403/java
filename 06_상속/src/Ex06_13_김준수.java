abstract class Employee5{

	private String empno;
	private String name;
	private int pay;

	public Employee5(){	
	}

	public Employee5(String empno,String name,int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public void show() {
		System.out.println("사번 : "+empno);
		System.out.println("이름 : "+name);
		System.out.println("금액 : "+pay);
	}

	public abstract void getMonthPay();
}//Employee5

class FullTime extends Employee5{
	private int bonus;
	private double MonthPay;

	public FullTime() {
	}

	public FullTime(String empno,String name,int pay,int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
		this.MonthPay = (pay/(double)12) + (this.bonus/(double)12);
	}

	public void getMonthPay() {
		System.out.println("월급 : "+ MonthPay);
	}

	public void show() {
		super.show();
		System.out.println("보너스 : "+ bonus);
	}
}//FullTime

class Contract extends Employee5{
	private int hireYear;
	private double MonthPay;
	public Contract() {
	}
	
	public Contract(String empno,String name,int pay,int hireYear) {
		super(empno,name,pay);
		this.hireYear = hireYear;
		this.MonthPay = (pay/(double)12*hireYear);
	}

	public void getMonthPay() {
		System.out.println("월급 : "+ MonthPay);
	}

	public void show() {
		super.show();
		System.out.println("계약기간 : "+ hireYear);
	}

}//Contract

class PartTime extends Employee5{
	private int workDay;
	private double MonthPay;

	public PartTime() {
	}
	
	public PartTime(String empno,String name,int pay,int workDay) {
		super(empno,name,pay);
		this.workDay=workDay;
		this.MonthPay=(pay*workDay);
	}

	public void show() {
		super.show();
		System.out.println("월 근무일 : "+ workDay);
	}

	public void getMonthPay() {
		System.out.println("월급 : "+ MonthPay);
		//return pay*workDay;
	}
}//PartTime

public class Ex06_13_김준수 {

	public static void main(String[] args) {

		FullTime f = new FullTime("F3","제니",3000,500);
		f.show();
		f.getMonthPay();
		System.out.println("--------------------------");
		Contract c = new Contract("C2","보검",250,3);
		c.show();
		c.getMonthPay();
		System.out.println("--------------------------");
		PartTime p = new PartTime("P1","수지",30,20);
		p.show();
		p.getMonthPay();
		
		System.out.println("----------배열--------------");
		
		Employee5 arr[] = {
				new FullTime("F3","제니",3000,500),
				new Contract("C2","보검",250,3),
				new PartTime("P1","수지",30,20)
		};

		for(int i=0 ; i<arr.length;i++) {
			arr[i].show();
			arr[i].getMonthPay();
			System.out.println("--------------------------");
		}


	}//main

}
