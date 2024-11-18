package BuilderStream;

import java.util.stream.Stream;

/**
 * 11/16/2024 - 9:37 PM
 *
 * @author Vyshali Prabananth Lal
 */

public class BuilderStream {
    public static void main(String[] args) {
        Stream<String> streamFromBuilder = Stream.<String>builder().add("abc").add("def").add("ghi").build();
    }
}
