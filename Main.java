import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        for (int a = 0; a < n; a++) {
            x[a] = sc.nextDouble();
        }
        for (int a = 0; a < n; a++) {
            y[a] = sc.nextDouble();
        }
        double max = 0;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (max < Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2))) {
                    max = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    ii = i;
                    jj = j;
                }
            }
        }
        System.out.println(ii + " " + jj);
    }
}