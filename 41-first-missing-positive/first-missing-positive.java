class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(filteredNums);
        
        int target = 1;
        for (int n : filteredNums) {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        
        return target;        
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