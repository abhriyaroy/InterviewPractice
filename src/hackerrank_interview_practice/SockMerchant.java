package hackerrank_interview_practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        if (n <= 100 && n >= 1) {
            for (int index = 0; index < n; index++) {
                int element = ar[index];
                if (element <= 100 && element >= 1) {
                    if (!counter.containsKey(element)) {
                        counter.put(element, 1);
                    } else {
                        counter.put(element, (counter.get(element) + 1));
                    }
                } else {
                    System.exit(0);
                }
            }


            int pairCount = 0;

            for (HashMap.Entry<Integer, Integer> count : counter.entrySet()) {
                pairCount += count.getValue() / 2;
            }
            return pairCount;
        } else {
            System.exit(0);
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);


        scanner.close();
    }
}
