class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) {
                nums[i] = 0;
            }
            max = Math.max(max, nums[i]);
        }

        for(int i=0;i<nums.length;i++) {
            int index = Math.abs(nums[i]) - 1;
            if(index >= 0 && index < nums.length) {
                int val = nums[index];
                if(val == 0) {
                    nums[index] = (nums.length+1)* - 1;
                } else {
                    nums[index] = Math.abs(nums[index]) * - 1;
                }
            }
        }

        for(int i=1;i<=nums.length;i++) {
            int index = i - 1;
            if(nums[index] >= 0) {
                return i;
            }
        }

        return max + 1;
    }
}

// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         List<Integer> lp = new ArrayList<>();
//         List<Integer> ln = new ArrayList<>();

//         for(int i: nums){
//             if(i<1) ln.add(i);
//             else{
//                 lp.add(i);
//                 min = Math.min(min, i);
//                 max = Math.max(max, i);
//             }
//         }

//         if(lp.size()==0 && ln.size()!=0) return 1;

//         for(int i=1; i<=max; i++){
//             if(!lp.contains(i)) return i;
//             else if (i==max) return i+1;
//         }

//         return 0;        
//     }
// }