// //Leetcode: https://leetcode.com/problems/maximum-product-subarray/
// class Solution {
//     public int maxProduct(int[] nums) {
//         int pp=1;
//         int sp=1;
//         int max=Integer.MIN_VALUE;
//         int i=0;
//         int j=nums.length-1;
        
//         while(i<nums.length){
//             pp=pp*nums[i]; //prefix product starting from 0 and taking in the contigous elem..
        
//             sp=sp*nums[j];//sufixProduct starts from the last element and takes contigous elem
        
//             if(pp==0){
//                 pp=nums[i];
//             }
//             if(sp==0){
//                 sp= nums[j];
//             }
//             max = Math.max (max , Math.max(pp,sp));
//             i++;
//             j--;
//         }
//         return max;
//     }
// }
