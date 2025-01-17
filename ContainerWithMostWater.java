class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height==null || height.length <=1){
            return 0;
        }
        int n = height.length;
        int left = 0, right = n-1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int ht = Math.min(height[left], height[right]);
            int w = right-left;
            int capacity = ht*w;
            max = Math.max(max, capacity);
            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}