class Solution {
    public int[] getConcatenation(int[] n) {
        int arr[] = new int[n.length * 2];
        
        for(int i =0;i<n.length;i++){
            arr[i] = n[i];
        }
            int k = 0;
            for(int i=n.length;i<arr.length;i++){
                arr[i] = n[k];
                k++;
            }
            return arr;
        
    }
}
