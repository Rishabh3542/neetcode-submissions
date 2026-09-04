class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        for(int num:nums){
            int count = 0;
            for(int i:nums){
                if(i==num){
                    count++;
                }
            }
            if(count > length/2){
                return num;
            }

        }
        return -1;

    }
}