// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// 

// Your code here along with comments explaining your approachclass Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> twosum = new HashMap<>();
    
        for(int i=0;i<nums.length;i++)
           twosum.put(nums[i],i);
        
        for (int i=0;i<nums.length;i++)
        {
            int compliment=(target-nums[i]);
            if(twosum.containsKey(compliment)&&(twosum.get(compliment)!=i))
                 return new int[] {i, twosum.get(compliment)};      
        }
        return null;
    }
   
}