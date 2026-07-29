class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int a[] = new int[2];
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum = nums[i]+nums[j];
        //         if(sum==target){
        //             a[0]=i;
        //             a[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return a;

        int n= nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}