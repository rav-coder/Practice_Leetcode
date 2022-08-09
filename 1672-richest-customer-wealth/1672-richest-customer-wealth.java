class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;
        for(int [] customers : accounts){
            
            int current = 0;
            for(int i = 0; i< customers.length; i++){
                current += customers[i];
            }      
            max = Math.max(max, current);
        }
        
        return max;
    }
}