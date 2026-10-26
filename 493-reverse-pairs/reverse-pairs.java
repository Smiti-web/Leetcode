class Solution {
    void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];

    int left = low;
    int right = mid + 1;
    int k = 0;

    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) {
            temp[k++] = arr[left++];
        } else {
            temp[k++] = arr[right++];
        }
    }

    while (left <= mid) {
        temp[k++] = arr[left++];
    }

    while (right <= high) {
        temp[k++] = arr[right++];
    }

    for (int i = 0; i < temp.length; i++) {
        arr[low + i] = temp[i];
    }
}
int cp(int[] nums,int low,int mid,int high){
    int cnt=0;
    int r=mid+1;
    for(int i=low;i<=mid;i++){
        while(r<=high && nums[i]>2L*nums[r]){
            r++;
         }
          cnt+=(r-(mid+1));
         
    }
         return cnt;
}
int mergesort(int[] nums,int low,int high){
    int cnt=0;
    if(low>=high){return cnt;}
    int mid=(low+high)/2;
    cnt+=mergesort(nums,low,mid);
    cnt+=mergesort(nums,mid+1,high);
    cnt+=cp(nums,low,mid,high);
    merge(nums,low,mid,high);
    return cnt;

}
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergesort(nums,0,n-1);
        
    }
}