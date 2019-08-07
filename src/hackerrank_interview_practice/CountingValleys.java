package hackerrank_interview_practice;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        if (n <= Math.pow(10, 6) && n >= 2) {
            int height = 0;
            int valleyCounter = 0;
            boolean currentlyInValley = false;
            for (int i = 0; i < n; i++) {
                System.out.println("i is " + i);
                char element = s.charAt(i);


                if (element == 'U') {
                    height++;
                } else {
                    height--;
                }
                if (height == -1 && i == 0) {
                    currentlyInValley = true;
                    valleyCounter++;
                } else if (height == -1 && !currentlyInValley) {
                    currentlyInValley = true;
                    valleyCounter++;
                } else if (height == 0) {
                    currentlyInValley = false;
                }

            }
            return valleyCounter;
        } else {
            System.exit(0);
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        System.out.println(result);

        scanner.close();
    }
}
