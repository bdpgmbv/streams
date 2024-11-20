package arrays;

import java.util.Arrays;
import java.util.stream.Stream;
/*
 * 11/16/2024 - 7:50 PM
 *
 * @author Vyshali Prabananth Lal
 */

public class ArraysStream {
 public static void main(String[] args) {
  String[] arr = new String[]{"abc", "def","ghi"};

  Stream<String> streamFromArrayFull = Arrays.stream(arr);
  Stream<String> streamFromArrayHalf = Arrays.stream(arr, 1,2);
 }
}
