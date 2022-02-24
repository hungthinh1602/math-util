/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungthinh.mathutil.test;

import com.hungthinh.mathutil.core.MathUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HungThinh
 */
public class MathUtilTest {
    
//    public MathUtilTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
    // các hàm dể test các class nêm code chính sẽ ddatwdj ở dyad
    //ko đặt trong main() nữa!!!
    // tách riêng code dể test và code chính ea 2 nơi khác nhau
    
    //Test case #1 : check getF() with valid argrument
    //n = 0 (0!), expected = 1, actual = ? đoán xem
    @Test // annotation, bộ thư viện quy ước phải viết điều này
    // máy ảo JVM biết phải làm gì -> biến hàm dưới này thành main()
    public void testFactorialGivenValidArgrumentReturnsWell() {
        long expected = 1; // hy vong 0! =1
        long actual = MathUtil.getFactorial(0);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenValidArgrumentN6ReturnsWell() {
        long expected = 1; // hy vong 0! =1
        long actual = MathUtil.getFactorial(1);
        
        assertEquals(expected, actual);
    }
    
    //Case #3: ngoại lệ thì test làm sao
    // ngoại lệ ko phải là giá trị để so sánh
    // nó chỉ có ở hình dạng là : mày xh hay ko mà thôi
    // ko thể xài hàm aserEquals ( cần value dể so sánh)
    // nếu ta đưa vào n = -5, số âm thì phải nhận về ngoại lệ
    // thiết kế đúng của hàm, đưa âm, vượt 20 thì nhận về ngoại lệ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    // chạy như thiết kế thì phải là màu xanh cho dù có Exception
    //nhưng là Exception được phép xuất hiện
}
