class Solution {
    public int maximumWealth(int[][] accounts) {

        int[] sum = new int[accounts.length];
        int max = 0;
        for(int i=0; i< accounts.length; i++){
            for(int j=0; j< accounts[i].length; j++){
               sum[i] += accounts[i][j];
            }
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}
