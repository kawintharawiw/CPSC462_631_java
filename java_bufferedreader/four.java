import java.io.*;
class four {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int i[] = new int[5];
    int max = 0;
    int min = 999;
    int tot = 0;
    double average;
    for (int k=0; k<5; k++) {
    i[k] = Integer.parseInt(stdin.readLine());
    }
    for (int k=0; k<5; k++) {
      if (i[k] > max) {
      max = i[k];
      }
      if (i[k] < min) {
      min = i[k];
      }
      tot += i[k];
    }
    average = tot / i.length;
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("total = " + tot);
    System.out.println("average = " + average);
  }
}
