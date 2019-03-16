package com.gbn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class WaysOfCreatingStreams {
	public static void main(String[] args) {

		// 1 - empty stream

		Stream<String> streamEmpty = Stream.empty();
		System.out.println(streamEmpty);

		// 2 - Stream of collection

		List<Integer> list = new ArrayList<>();
		Stream<Integer> collectionStream = list.stream();
		System.out.println(collectionStream);

		// 3 - Stream of Array
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		System.out.println(streamOfArray);

		// 4 - Stream.builder()
		// in this case if we dont give type parameter it take it as Object

		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		System.out.println(streamBuilder);

		// 5 - Stream.generate()
		Stream<String> streamGenerated = Stream.generate(() -> "hello").limit(10);
		System.out.println(streamGenerated);

		// 6 - Stream.iterate()
		// in this case start element is 10 and incremented to 2 with limit of
		// 20 elements

		Stream<Integer> streamIterated = Stream.iterate(10, n -> n + 2).limit(20);
		System.out.println(streamIterated);

		// 7 - Stream of Primitives

		// Java 8 offers a possibility to create streams out of three primitive
		// types: int, long and double. As Stream<T> is a generic interface and
		// there is no way to use primitives as a type parameter with generics,
		// three new special interfaces were created: IntStream, LongStream,
		// DoubleStream.

		IntStream intStream = IntStream.range(1, 3); // 1, 2 excludes upper endExclusive
		LongStream longStream = LongStream.rangeClosed(1, 3); // rangeClosed includes endExclusive
		System.out.println(intStream.sum());
		System.out.println(longStream.sum());

	}

}
