public class palindromeString {
    public static void main(String [] args){
        String st = "Nayan";
        StringBuilder sb =  new StringBuilder(st);
        String rev = sb.reverse().toString();
        if(rev.equalsIgnoreCase(st))
        {
            System.out.println("Palindrome String : " + rev );
        }
        else{
            System.out.println("Not a palindrome String : ");
        }
    }
}
