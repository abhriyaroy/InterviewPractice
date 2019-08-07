package hackerrank_interview_practice;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int originalLength = s.length();
        int originalStringACount = 0;
        long finalACount = 0;
        for (int i = 0; i < originalLength; i++) {
            if (s.charAt(i) == 'a') {
                originalStringACount++;
            }
        }
        finalACount = (n / originalLength) * originalStringACount;
        long remainingCharactersLength = n % originalLength;
        if (remainingCharactersLength != 0) {
            for (int i = 0; i < remainingCharactersLength; i++) {
                if (s.charAt(i) == 'a') {
                    finalACount++;
                }
            }
        }
        return finalACount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}
