class Solution {
    public int maxDistance(int[] position, int m) {
       Arrays.sort(position);
       int n = position.length;
       int low = 0;
       int high = position[n-1]-position[0];
       int ans = -1;
       while(low<=high){
        int mid = low+(high-low)/2;

        if(canWePlace(position,mid,m)==true){
            ans = mid;
            low=mid+1;
        }
        else{
            high = mid -1;
        }
       }
       return high; 
    }
    public boolean canWePlace(int [] position,int dist,int m){
       int cntballs=1;
       int last=position[0];
       for(int i = 1;i<position.length;i++){
        if(position[i]-last>=dist){
            cntballs++;
            last = position[i];
        }
       }
       if(cntballs>=m) return true;
       else return false;
    }
}