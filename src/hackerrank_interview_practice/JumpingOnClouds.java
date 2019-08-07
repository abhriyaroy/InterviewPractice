package hackerrank_interview_practice;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int i = 0;
        int jumps = -1;
        while (i < c.length) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(cItems);

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
            System.out.println(i);
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}
