package reversestring;

public class ReverseString {

    /**
     * 该方法是通过charAt()方法获得每一个char的字符，i=0时获得第一个字符a然后赋值给reverse
     * 此时reverse="a";i=1时获得第二个字符b然后加上reverse再赋值给reverse，此时reverse="ba";
     * 一次类推
     */
    public static String CharAtreverse(String s) {
        int length = s.length();
        String reverse = "";
        for (int i=0; i<length; i++)
            reverse = s.charAt(i) + reverse;
        return reverse;
    }

}
