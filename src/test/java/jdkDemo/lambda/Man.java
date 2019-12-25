package jdkDemo.lambda;

import lombok.Data;

@Data
public class Man {
	public Man(int age, String name, Double money) {
		super();
		this.age = age;
		this.name = name;
		this.money = money;
	}
	int age;
	String name;
	Double money;

}
