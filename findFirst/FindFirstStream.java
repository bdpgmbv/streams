package findFirst;

import java.util.stream.Stream;
import java.util.Optional;

/*
 * 11/19/2024 - 9:31 AM
 * @author Vyshali Prabananth Lal
 */

public class FindFirstStream {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("abc", "abd", "ade", "def").filter(e -> e.contains("a"));
        Optional<String> firstElement = stream.findFirst();

        // Stream has already been linked or consumed
        // Optional<String> anyElement = stream.findAny();
    }
}
