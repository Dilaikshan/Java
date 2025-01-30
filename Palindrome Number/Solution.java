

public class Solution {
    public static boolean find(int num)
    {
        if (num<0) {
            return false;
        }
        int temp=num;
        int test=0;
        while(temp!=0)
        {
            test*=10;
            test += temp % 10;
            temp/=10;
        }
        
        if (num==test) {
            return true;
        }else{
            return false;
        }



    }

    public static void main(String[] args) {
       System.out.println(Solution.find(1231)); 
    }
    
}
