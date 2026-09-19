class Solution {
    public void sortColors(int[] nums) {
        int red_0 = 0;
        int white_1=0;
        int blue_2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                red_0+=1;
            }
            else if(nums[i]==1){
                white_1+=1;
            }
            else{
                blue_2+=1;
            }
        }
        int index = 0;

        while (red_0 > 0) {
        nums[index++] = 0;
        red_0--;
        }

        while (white_1 > 0) {
        nums[index++] = 1;
        white_1--;
        }

        while (blue_2 > 0) {
        nums[index++] = 2;
        blue_2--;
        }
    }
}