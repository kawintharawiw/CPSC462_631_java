import java.io.*;
class one {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int i[] = new int[5];
    int plus = 0, Minus = 0, Multi = 0, Divide = 0;
    for (int k=0; k<5; k++) {
    i[k] = Integer.parseInt(stdin.readLine());
    }
    for (int k=0; k<5; k++) {
      plus = i[0] + i[1] + i[2] + i[3] + i[4];
      Minus = i[0] - i[1] - i[2] - i[3] - i[4];
      Multi = i[0] * i[1] * i[2] * i[3] * i[4];
      Divide = i[0] / i[1] / i[2] / i[3] / i[4];
    }
    System.out.println("plus = " + plus);
    System.out.println("Minus = " + Minus);
    System.out.println("Multi = " + Multi);
    System.out.println("Divide = " + Divide);
  }
}
