package array;

import java.util.Arrays;
import java.util.Spliterator;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] intIdArray = { 5, 7, 81, 5 };
		Spliterator<Integer> split1 = Arrays.spliterator(intIdArray);
		System.out.println("Int array");
		split1.forEachRemaining(System.out::println);
		long[] longIdArray = { 65, 87, 901, 455 };
		Spliterator<Long> split2 = Arrays.spliterator(longIdArray);
		System.out.println("long array");
		split2.forEachRemaining(System.out::println);
		double[] doubleIdArray = { 65.3, 87.6, 90.9, 45.5 };
		Spliterator<Double> split3 = Arrays.spliterator(doubleIdArray);
		System.out.println("double array");
		split3.forEachRemaining(System.out::println);
	}

}
