/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3b;

/**
 *
 * @author ckc
 */
public class Cal {
        Debug dttf = new DebugToTextFile();
        
            public void compute() {

        int x = 2, y = 3;
        String s = "hello";

        dttf.log("Cal: compute()");
        int n = method1(x, y);
        int m = method2(s);
        dttf.log("method1(" + x + "," + y + ")" + "=" + n);
        dttf.log("method2(" + s + ")" + "=" + m);
    }

    int method1(int x, int y) {
        dttf.log("Cal: method1(" + x + "," + y + ")");
        return x + method3(y);
    }

    int method3(int y) {
        dttf.log("Cal: method3(" + y + ")");
        return 2*y;
    }

    int method2(String s) {
        dttf.log("Cal: method2(" + s + ")");
        return s.length()-2;
    }
}
