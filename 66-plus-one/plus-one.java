class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } else if(digits[i]==9){
                digits[i]=0;
            }
        }

        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;



        // // fine only for smaller number
        // long n = 0;
        // int p = digits.length-1;
        // for(int i: digits){
        //     n+=i*Math.pow(10, p--); 
        // } 

        // ArrayList<Long> al = new ArrayList<>();
        // long temp = n+1;
        // while(temp!=0){
        //     al.add(0, temp%10);
        //     temp/=10;
        // } 

        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<al.size(); i++){
        //     sb.append(al.get(i));
        // }
        
        // int[] res = new int[sb.length()];
        // for(int i=0; i<res.length; i++){
        //     res[i] = sb.charAt(i) - '0';
        // }
        // return res;
    }
}