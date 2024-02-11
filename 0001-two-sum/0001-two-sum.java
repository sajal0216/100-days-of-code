class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> Map = new HashMap();
        // Fill HashMap
        for(int i = 0 ; i < nums.length ; i++ ){
            Map.put(nums[i] , i);
            
        }
        //searching
        for(int  i = 0; i < nums.length ; i++){ //2 7 11 15 target=9
            int num = nums[i]; //2
            int rem = target - num;
            if(Map.containsKey(rem)){
                int index = Map.get(rem);
                if(index == i)continue;
                return new int[] {i , index};
            }
        }
        return new int[]{};
    }
}