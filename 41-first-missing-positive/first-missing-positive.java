class Solution {
    public int firstMissingPositive(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++) 
            if(nums[i]<=0) 
                nums[i]=n+1;

        for(int i=0;i<n;i++) {
            int p = Math.abs(nums[i]);
            if(p<=n && nums[p-1]>0){
                nums[p-1]=-nums[p-1];
            }
        }

        for(int i=0;i<n;i++) 
            if(nums[i]>0) 
                return i+1;

        return n+1;
    }
}

// fine upto 172 test cases
// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int max = Integer.MIN_VALUE;

//         List<Integer> lp = new ArrayList<>();
//         List<Integer> ln = new ArrayList<>();

//         for(int i: nums){
//             if(i<1) ln.add(i);
//             else{
//                 lp.add(i);
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