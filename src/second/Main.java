package second;
public class Main {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 3, 4};// Считаем, что монет каждого типа неограниченное количество
        int sum = 7;//необходимая сумма
        int ways = countWays(sum, coins);
        System.out.println(ways);
    }

    private static int countWays(int sum, int[] coins) {
        int[] waysChange = new int[sum + 1];
        waysChange[0] = 1;
        for (int coin : coins) {
            for (int j = 0; j < waysChange.length; j++) {
                if (coin <= j) {
                    waysChange[j] += waysChange[j - coin];
                }
            }
        }
        return waysChange[sum];
    }
}