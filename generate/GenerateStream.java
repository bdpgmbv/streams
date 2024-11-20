package generate;

import java.util.stream.Stream;

/*
 * 11/18/2024 - 10:00 PM
 *
 * @author Vyshali Prabananth Lal
 */

public class GenerateStream {
    public static void main(String[] args) {
        Stream<String> streamFromGenerate = Stream.generate(() -> "element").limit(10);
    }
}


/*
 * Infinite Stream
 */