package getkeyfromjsonstring;

import java.util.Scanner;

//json串中找出特定的一个结点对象。
/*
in:
{"temp":123}
temp

out:
123
* */
public class GetKeyFromJsonString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String key = in.next();
        System.out.println(getKeyFromJsonString(str, key));

    }

    private static String getKeyFromJsonString(String str, String key) {
        String result = null;
        if (!str.isEmpty()) {
            key = "\"" + key.replace("\"", "") + "\"";

            int index = str.indexOf(str) + key.length() + 1;

            if (index >= key.length() + 1) {
                int end = str.indexOf(',', index);
                if (end == -1) {
                    end = str.indexOf('}', index);
                }
                //去掉冒号  index +1
                result = str.substring(index + 1 , end).trim(); }
        }
        return result;
    }
}
