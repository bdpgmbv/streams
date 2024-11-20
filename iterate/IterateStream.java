package iterate;

import java.util.stream.Stream;

/*
 * 11/18/2024 - 10:18 PM
 * @author Vyshali Prabananth Lal
 */
public class IterateStream {
    public static void main(String[] args) {
        Stream<Integer> streamFromIterate = Stream.iterate(40, n -> n + 2).limit(20);
    }
}
