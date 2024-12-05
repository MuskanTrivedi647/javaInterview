public class reverseNumber {
    public static void main(String[] args)
    {
        int num = 1234;
        int rev =0;
        while(num!=0)
        {
            int res = num%10;
            rev= rev*10+res;
            num=num/10;
        }

        System.out.println("Reverse of nukber : " + rev);
    }
}
