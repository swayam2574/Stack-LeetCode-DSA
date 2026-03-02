class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> res = new ArrayList<>();

        // Arrays.sort(nums);
        // int n = nums.length;

        // for(int i=0; i<n-2; i++){
        //     if(i>0 && nums[i]==nums[i-1]) continue;
        //     int l = i+1, r = n-1;
        //     while(l<r){
        //         int sum = nums[i]+nums[l]+nums[r];
        //         if(sum==0){
        //             res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
        //             while(l<r && nums[l]==nums[l-1]) l++;
        //             while(l<r && nums[r]==nums[r+1]) r--;
        //         } else if (sum<0) l++;
        //         else r--;
        //     }

        // }
        // return res;


        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;

            if (nums[i] + nums[n - 2] + nums[n - 1] < 0) continue;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } 
                else if (sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}