/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungthinh.mathutil.main;

import com.hungthinh.mathutil.core.MathUtil;

/**
 *
 * @author HungThinh
 */
public class Main {
    
    public static void main(String[] args) {
        // test thử coi hàm tính giai thừa chạy đúng hay không ???
        // kiểm thử là so sánh giữa EX & AC
        // ta phải tưởng tượng xem KH xài app như thế nào ta dùng trước họ
        // ta phải tưởng tượng các tình huống  họ xài -> TEST CASES
        
        // CASE #1: check the getF() with valid argument (n = 0..20)
        //n = 0 -> expected = 1 0! phải trả về 1, t kì vọng như thế
        
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // ss giữa EX và AC
        System.out.println("cehck 0!; expected: " + expected +
                 "; actual: " + actual);
        
        //CASE #2:
        // n = 6 -> expected = 720, 6! = 720 mới là Đ
        expected = 720;
        actual = MathUtil.getFactorial(6);
        System.out.println("cehck 6!; expected: " + expected +
                 "; actual: " + actual);
        
        //CASE #..1,..2,..20! VALID ARGUMENT
        
        // CASE #x check getF() with invalid argument
        // expected = ??? cái gì đây mình muốn tính -5!
        // hy vọng của ta là muốn thấy được ngoại lệ, IllegalArgumentException
        // sure -5! phải xh ngoại lệ
        // nếu getF(-5) mà ném ra ngoại lệ thì mừng khóc
        MathUtil.getFactorial(-5);
        
    }
}
