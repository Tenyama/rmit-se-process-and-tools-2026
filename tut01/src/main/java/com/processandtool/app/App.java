package com.processandtool.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    List<Integer> a = List.of(1, 5, 3, 2, 4);
    List<Integer> sorted = bubbleSort(a);
    List<Integer> earlyTermSorted = earlyTermBubbleSort(a);

    System.out.println(a); // [1, 5, 3, 2, 4]
    System.out.println(sorted); // [1, 2, 3, 4, 5]
    System.out.println(earlyTermSorted); // [1, 2, 3, 4, 5]
  }

  private static List<Integer> bubbleSort(List<Integer> input) {
    List<Integer> result = new ArrayList<>(input);
    int n = result.size();

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (result.get(j) > result.get(j + 1)) {
          int tmpHolder = result.get(j);
          result.set(j, result.get(j + 1));
          result.set(j + 1, tmpHolder);
        }
      }
    }

    return List.copyOf(result);
  }

  private static List<Integer> earlyTermBubbleSort(List<Integer> input) {
    List<Integer> result = new ArrayList<>(input);
    int n = result.size();

    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;

      for (int j = 0; j < n - 1 - i; j++) {
        if (result.get(j) > result.get(j + 1)) {
          int tmpHolder = result.get(j);
          result.set(j, result.get(j + 1));
          result.set(j + 1, tmpHolder);
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }

    return List.copyOf(result);
  }
}
