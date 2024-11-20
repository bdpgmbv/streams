package findAny;

import java.util.stream.Stream;
import java.util.Optional;

/*
 * 11/19/2024 - 9:31 AM
 * @author Vyshali Prabananth Lal
 */
public class FindAnyStream {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("abc", "acd", "adf", "def").filter(e -> e.contains("a"));
        Optional<String> anyElement = stream.findAny();

        // Stream has already been linked or consumed
        // Optional<String> findFirst = stream.findFirst();
    }
}
