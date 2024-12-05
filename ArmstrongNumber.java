public class ArmstrongNumber {
    public static void main(String [] args)
    {
        int num = 15390;
        int sum = 0;
        int temp = num;
        int power = String.valueOf(num).length();
        while (num!=0) {
            int res = num%10;
            sum = sum +(int) Math.pow(res,power);
            num = num/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong Number " + temp);
        }
        else
        {
            System.out.println("Not an armstrong Number :- " + temp);
        }
    }


}
