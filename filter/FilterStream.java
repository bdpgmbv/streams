package filter;

import java.util.stream.Stream;
import java.util.Optional;

/*
 * 11/19/2024 - 9:30 AM
 * @author Vyshali Prabananth Lal
 */

public class FilterStream {
    public static void main(String[] args) {

        Stream<String> streamAfterFilter = Stream.of("abc", "abd", "acd", "dfg").filter(e -> e.contains("a"));
        Optional<String> anyElement = streamAfterFilter.findAny();

        // IllegalStateException - Stream has already been linked or consumed
        // Optional<String> firstElement = streamAfterFilter.findFirst();
    }
}
