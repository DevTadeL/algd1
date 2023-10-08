package ch.tadel.algd1;

import ch.tadel.algd1.algorithms.Search;

public class Algd1 {

  private static int[] testArray = {1, 3, 4, 5, 6, 8, 9, 21, 23, 26, 33, 35, 36, 37, 38, 39, 40, 42, 56, 56, 57};

  public static void main(String[] args) {
    System.out.println(Search.containsElementBinary(testArray, 1));
  }
}
