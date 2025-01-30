class Problem{
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            
        }

        return result;
    }
}

class Solution{
    public static void main(String[] args) {
        Problem obj=new Problem();
        int[] arr={3,2,3};
        
        int[] result=obj.twoSum(arr, 6);

        for (int i : result) {
            System.out.println(i);
        }

    }
}