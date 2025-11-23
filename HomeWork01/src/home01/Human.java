package home01;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human() {}
	public Human(String name, int age, int height, int weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight=weight;
		
		System.out.printf("이름 : %d, 나이 : %s, 키 : %s 무게 : %s\n",name, age, height, weight);
	}

	
	
}
