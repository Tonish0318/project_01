package hellow;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : Wentao Zou
 * @since : 17/9/20
 **/

public class head_try {
    private static final hell a = new hell();
    public static void main(String[] args) {
        a.method();
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("head_try.main");
        int n = 10;
        System.out.println("n = " + n);
        System.out.println(n);
        String[] s = new String[]{"as","sa","dd"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            System.out.println(s1);

        }
        ArrayList aa = new ArrayList();
        aa.add(11);
        aa.add(22);
        aa.add(33);
        for (Object o : aa) {
            
        }
        if (aa == null) {

        }
        for (int i = aa.size() - 1; i >= 0; i--) {
            if (aa.get(i) != null) {
                if (aa.get(i) == null) {

                }
            }
        }
        for (int i = 0; i < aa.size(); i++) {
            
        }
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            
        }

    }






}
