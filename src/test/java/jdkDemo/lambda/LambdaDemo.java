package jdkDemo.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

public class LambdaDemo {
	public static void main(String[] args) {
		// test2();
		test3();
		/*
		 * Runnable r1 = () -> System.out.println("hello lambda"); r1.run();
		 */
	}

	@Test
	public static void test4() {

	}

	public static void test3() {
		List<Man> menlist = Arrays.asList(new Man(74, "张三", 16844.00), 
				new Man(14, "张三", 26685.00),
				new Man(18, "i四", 36844.00), 
				new Man(13, "a五", 46844.00), 
				new Man(25, "b六", 56844.00));
		menlist.stream()
		.sorted((e1,e2) -> {
			if(e1.getAge()==e2.getAge())
			{
				return e1.getName().compareTo(e2.name);
			}
			else
			{
				return e2.getAge()-e1.getAge();
			}
		}).forEach(System.out::println);
		//menlist.stream().filter((e) -> e.age > 15).forEach(System.out::println);

		//menlist.stream().map(Man::getName).forEach(System.out::println);

	}

	public static void test2() {

		Comparator<Integer> comparator = (x, y) -> Integer.compare(y, x);
		TreeSet<Integer> ts = new TreeSet<>(comparator);
		ts.add(1);
		ts.add(18);
		ts.add(24);
		ts.add(25);
		ts.add(21);
		ts.add(20);
		System.out.println(ts);
	}

	public void test1() {
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2, o1);
			}
		};
		TreeSet<Integer> ts = new TreeSet<>(com);
		ts.add(1);
		ts.add(18);
		ts.add(24);
		ts.add(25);
		ts.add(21);
		ts.add(20);
		System.out.println(ts);

	}

}
