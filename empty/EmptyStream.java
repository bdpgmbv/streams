package empty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 11/16/2024 - 8:35 PM
 *
 * @author Vyshali Prabananth Lal
 */
public class EmptyStream {
    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();

        Stream<String> getStream = streamOf(Arrays.asList("a", "b", "c"));
    }
}
