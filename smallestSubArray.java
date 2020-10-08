public class smallestSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int S=115;
       System.out.println( SmallestSubArray(S, arr));
    }
    public static int SmallestSubArray(int S,int[] arr){
        int windowSum=0;
        int minlength=Integer.MAX_VALUE;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum+=arr[windowEnd];
            while(windowSum>=S){
                minlength=Math.min(minlength,windowEnd-windowStart+1);
                windowSum-=arr[windowStart];
                windowStart++;
                
            }
        }
        return minlength==Integer.MAX_VALUE ? 0 : minlength;
    }
}
