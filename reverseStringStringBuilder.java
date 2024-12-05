public class reverseStringStringBuilder {
    public static void main(String [] args){
        String str = "Smith";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse using string builder :- " + sb.reverse());
    }
}
