public class palindromeNumber {
    public static void main(String [] args)
    {
        int num = 150;
        int rev = 0;
        int temp = num;
        while (num!=0)
        {
            rev = rev*10+num%10;
            num= num/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome Number :- " +  temp);
        }

        else

        {
            System.out.println("Not a palindrome number : " + temp);
        }
    }
}
