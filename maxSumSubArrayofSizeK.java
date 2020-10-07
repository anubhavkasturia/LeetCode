class maxSumSubArrayofSizeK{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
        // System.out.println(maxSumSubArray(arr,k));
        System.out.println(slidingWindow(arr, k));
    }
    public static int maxSumSubArray(int[]arr,int k){
        int windowsum, maxsum=0;
        for(int i=0;i<=arr.length-k;i++){
            windowsum=0;
            for(int j=i;j<=i+(k-1);j++){
                windowsum+=arr[j];
            }
            maxsum=Math.max(windowsum, maxsum);
        }
        return maxsum;
    }

    public static int slidingWindow(int []arr, int k){
        int windowSum=0;
        int maxsum=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum+=arr[windowEnd];
            if(windowEnd>=k-1){
                maxsum=Math.max(windowSum, maxsum);
                windowSum-=arr[windowStart];
                windowStart++;
            }
            
        }
        return maxsum;
    }


}
