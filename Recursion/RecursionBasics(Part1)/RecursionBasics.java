public class RecursionBasics {
  //print numbers in decreasing order
  public static void printDec(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.println(n + "  ");
    printDec(n - 1);
  }

  //print numbers in increasing order  n -> Tc=O(n), SC = O(n)?not sure check again
  public static void printInc(int n) {
    if (n == 1) {
      System.out.print(n + "  ");
      return;
    }
    printInc(n - 1);
    System.out.print(n + "  ");
  }


  //print factorial of number n -> Tc=O(n), SC = O(n)
  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    int fnm1 = fact(n - 1);
    int fn = fnm1 * n;
    return fn;
  }
  
  //print sum of first n natural numbers -> Tc=O(n), SC = O(n)
  public static int calSum(int n) {
    if (n == 1) {
      return 1;
    }
    int Snm1 = calSum(n - 1);
    int Sn = n + Snm1;
    return Sn;
  }

  public static void main(String[] args) {
    int n = 5;
    // printDec(n);
    // printInc(n);
    // System.out.println(fact(n));
    System.out.println(calSum(n));
  }
}



