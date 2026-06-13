package TUF_Basic.Language_Basics;

public class String_last_char
{
    public char lastChar(String s) {
        //your code goes here
        int l = s.length();
        char ch = s.charAt(l - 1);
        return ch;
    }

    public static void main(String[] args) 
    {
        String_last_char obj = new String_last_char();
        String s = "Hello, World!";
        char result = obj.lastChar(s);
        System.out.println("Last character: " + result); // Expected: '!'
    }
}
