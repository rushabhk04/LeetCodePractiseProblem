import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    public static int[] knapsack(int[] weights, int[] profits, int W) {
        int maxProfit = 0;
        List<Integer> S = new ArrayList<>();
        List<Integer> M = new ArrayList<>();
        int n = weights.length;

        if (sum(weights, n) <= W) {
            int[] result = new int[2];
            result[0] = sum(profits, n);
            result[1] = n;
            return result;
        }

        generateSubsets(weights, profits, n, S, M, maxProfit, W);

        int[] result = new int[M.size() + 1];
        result[0] = maxProfit;
        for (int i = 0; i < M.size(); i++) {
            result[i + 1] = M.get(i);
        }

        return result;
    }

    private static void generateSubsets(int[] weights, int[] profits, int n,
                                        List<Integer> S, List<Integer> M, int maxProfit, int W) {
        if (n == 0) {
            if (sum(weights, S) <= W && sum(profits, S) > maxProfit) {
                maxProfit = sum(profits, S);
                M.clear();
                M.addAll(S);
            }
        } else {
            generateSubsets(weights, profits, n - 1, S, M, maxProfit, W);
            List<Integer> T = new ArrayList<>(S);
            T.add(n - 1);
            generateSubsets(weights, profits, n - 1, T, M, maxProfit, W);
        }
    }

    private static int sum(int[] arr, List<Integer> indices) {
        int sum = 0;
        for (int i : indices) {
            sum += arr[i];
        }
        return sum;
    }

    private static int sum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
