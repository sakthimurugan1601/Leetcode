class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if (n < 3) {
            return n;
        }

        int max = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int total = 2;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        double slope1 = (p[j][1] - p[i][1]) / ((p[j][0] - p[i][0]) * 1.0);
                        double slope2 = (p[k][1] - p[i][1]) / ((p[k][0] - p[i][0]) * 1.0);
                        if (slope1 == slope2) {
                            total++;
                        }
                    }
                }

                max = Math.max(max, total);
            }
        }

        return max;
    }
}

