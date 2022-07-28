public class Q12_Palindrome {
    public static void main(String[] args) {
        String str = "21";
        System.out.println(str);

        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
        boolean isPalindrome = reversedStr.equals(str);
        System.out.println(isPalindrome);
    }
}
