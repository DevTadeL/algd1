package ch.tadel.algd1.algorithms;

public abstract class Search {
  public static boolean containsElementLinear(int[] array, int number) {
    int i = 0; /* 1 */
    while (/* 2 */ i < array.length && (/* 3 */ array[i] != number))
      i++; /* 4 */

    return i < array.length; /* 5 */
  }

  public static boolean containsElementBinary(int[] array, int number) {
    int l = -1, h = array.length;

    while (h - l > 1) {
      int i = (l + h) / 2;

      if (array[i] == number)
        return true;

      if (number < array[i])
        h = i;
      else
        l = i;

    }
    return false;
  }
}
