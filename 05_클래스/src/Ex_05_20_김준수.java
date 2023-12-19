class School {
	private String name;
	private String region;
	private int population;
	private boolean gyunggido;

	public void display() {
		System.out.println("학교이름 : " + name);
		System.out.println("지역 : " + region);
		System.out.println("인구수 : " + population);
		System.out.println("경기도인가 : " + gyunggido);
	}

	public School() {
		name = "인천고등학교";
		region = "인천";
		population = 1000;
		gyunggido = false;
	}

	public School(String name, String region, int population, boolean gyunggido) {
		this.name = name;
		this.region = region;
		this.population = population;
		this.gyunggido = true;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setGyunggido(boolean gyunggido) {
		this.gyunggido = gyunggido;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public int getPopulation() {
		return population;
	}

	public boolean getGyunggido() {
		return gyunggido;
	}
}

public class Ex_05_20_김준수 {
	public static void main(String[] args) { // 객체 3개 1생성자 주입()-2생성자 주입(,,)-3setter주입

		School s = new School();
		s.display();
		System.out.println();

		School s1 = new School("부천고등학교", "부천", 500, true);
		System.out.println("학교이름 : " + s1.getName());
		System.out.println("지역 : " + s1.getRegion());
		System.out.println("인구수 : " + s1.getPopulation());
		System.out.println("경기도인가 : " + s1.getGyunggido());

		System.out.println();

		School s2 = new School();
		s2.setName("경남고등학교");
		s2.setRegion("경상남도");
		s2.setPopulation(100);
		s2.setGyunggido(false);
		s2.display();
		System.out.println("------------------------");

		System.out.println("객체배열 출력 ");

		System.out.println("------------------------");

		School[] arr = new School[3];
		arr[0] = s;
		arr[1] = s1;
		arr[2] = s2;

		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
			System.out.println();
		}

		for (School c : arr) {
			c.display();
		}
		// 전체출력 메서드 1,3번객체 - getter통한 출력 2번객체
		// 객체 배열 추가
	}

}
