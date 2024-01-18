package miniproject;

public class Person {

	// 필드
	private String num;
	private String name;
	private String hp;
	private String company;

	// 생성자
	private Person() {

	}

	// 디폴트 생성자
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드g/s
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	public void showInfo() {
		System.out.printf(this.name,this.hp,this.company);
	}


	
	

}
