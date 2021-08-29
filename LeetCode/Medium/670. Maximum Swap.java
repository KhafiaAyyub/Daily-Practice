package array;

public class MaximumSwap {

  public static void main(String[] args) throws Exception {
    System.out.println(new MaximumSwap().maximumSwap(2736));
  }

  public int maximumSwap(int num) {
    int[] D = new int[10];
    char[] A = String.valueOf(num).toCharArray();
    for (int i = 0; i < A.length; i++) {
      D[A[i] - '0'] = i;
    }

    boolean found = false;

    for (int i = 0; i < A.length; i++) {
      int digit = A[i] - '0';
      for (int j = 9; j > digit; j--) {
        if (D[j] > i) {
          char temp = A[i];
          A[i] = (char) (j + '0');
          A[D[j]] = temp;
          found = true;
          break;
        }
      }
      if (found) break;
    }

    return Integer.parseInt(String.valueOf(A));
  }
}
