package isPalindrome;
/*
examples of palindrome
level, eve,
 */
public class Palindrome {
    public boolean isPalindrome(String string) {
        int p = 0;
        int q = string.length() - 1;
        while (p < q) {
            if (string.charAt(p) != string.charAt(q)){
                return false;
            }
            p += 1;
            q -= 1;
        }
        return true;
    }
}
