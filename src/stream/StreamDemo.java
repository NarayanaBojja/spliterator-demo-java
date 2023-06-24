package stream;

import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		var stream = Stream.of("Hari ", "Suri ", "Krishna ", "Suri");
		System.out.println("Using tryAdvance");
//		Spliterator<String> split = stream.spliterator();
//		while (split.tryAdvance(System.out::print));
		System.out.println("\nUsing forEachRemaining");
		Spliterator<String> split1 = stream.spliterator();
		split1.forEachRemaining(System.out::print);
	}

}
