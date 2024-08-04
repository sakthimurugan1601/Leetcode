class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>(); //create a new arraylist
        ans.add(1); // Add the first element of the row, which is always 1
        if(rowIndex == 0)   return ans;   // If rowIndex is 0, return 1
        long coeff = 1; //use a coeff varibale to store value
        
        for(int i=1 ; i<rowIndex ; ++i){ 
            coeff = (coeff * (rowIndex-(i-1)) ) /i;
            ans.add((int)coeff);
        }
        ans.add(1); // Add the last element which is always 1
        return ans;
    }
}