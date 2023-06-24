package collection;

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {

	public static void main(String[] args) {
		var namesSet = new HashSet<String>();
		namesSet.add("Hari ");
		namesSet.add("Suri ");
		namesSet.add("Krishna ");
		namesSet.add("Suri ");		
		System.out.println("Using tryAdvance");
		Spliterator<String> split =  namesSet.spliterator();
		while (split.tryAdvance(System.out::print));
		System.out.println("\nUsing forEachRemaining");
		Spliterator<String> split1 =  namesSet.spliterator();
		split1.forEachRemaining(System.out::print);
		//TrySplit
		Spliterator<String> split2 =  namesSet.spliterator();
		Spliterator<String> split3 =  split2.trySplit();
		System.out.println("\nUsing forEachRemaining 1");
		if(split3 !=null) {
			split3.forEachRemaining(System.out::print);
		}
		System.out.println("\nUsing forEachRemaining 2");
		split2.forEachRemaining(System.out::print);
	}

}
