bool isPalindrome(int x) {
    if (x<0)
        return false;
    long int r=0,a,sum=0;
     a=x;
    while(x!=0)
    {
         r= x%10;
         sum = sum*10+r;
         x=x/10;
    }
    if(sum==a)
        return true;
    else
        return false;
    
}