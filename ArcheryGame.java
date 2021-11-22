import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        int[][] total = new int[3][4];
        String[] sequence = {"First", "Second", "Third"};

        for (int score = 0; score < 3; score++) {
            for (int person = 0; person < 4; person++) {
                int n = rand.nextInt(11);

                total[score][person] = n;
            }
        }

        // System.out.printf("%16s  %s  %s  %s%n", "Player1", "Player2", "Player3", "Player4");
        System.out.printf("%10s  %s  %s  %s%n", "p1", "p2", "p3", "p4");


        for (int i = 0; i < 3; i++) {
            String result = sequence[i];
            System.out.printf("%-6s", result);

            for(int score : total[i]) {
                if (i == 1) {
                    System.out.printf("%4s", score);
                }
                else {
                    System.out.printf("%4s", score);
                }
            }
            System.out.printf("%n");
        }

        int maxNum = 0;
        String winner = "";
        int p;

        for (p = 0; p < 4; p++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += total[i][p];
            }

            if (sum > maxNum) {
                maxNum = sum;
                winner = "Player" + String.valueOf(p + 1);
            }
        }

        System.out.printf("%n%s%d%n%s%s%n", "Maximum: ", maxNum, "Winner: ", winner);

    }
}
