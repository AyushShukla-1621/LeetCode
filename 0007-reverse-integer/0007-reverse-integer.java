class Solution {
    public int reverse(int x) {
   // I WAS USING THIS TRICK AND I WAS STUCKED IN THIS FOR A VERY LONG TIME TODAY I FOUND THE SOLUTION . 
    //    int sum=0;                
    //    if (x==0)
    // return  x;
    //while(x>0 || x<0)
    //{
    //    int r=x%10;
    //    sum=sum*10+r;
    //    x=x/10;
    //}
    //return sum;
    //
          long rev=0;
      while(x!=0){
        rev=rev*10 + x%10;
        x=x/10;
      }
      if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
        return 0;
      }  

      return (int) rev;


        }
    }
