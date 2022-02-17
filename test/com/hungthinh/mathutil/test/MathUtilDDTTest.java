package com.hungthinh.mathutil.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.hungthinh.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author HungThinh
 */
@RunWith(value = Parameterized.class)
// bien class chứa code của mình thành 1 memember/implement
    //cái Interface Parametterized, tham số hóa, biến data thành cụ thể
public class MathUtilDDTTest {
    
     // 
    
    public MathUtilDDTTest() {

    }
    
            // 0! -> 1
        // 1! -> 1
        // 2! -> 2
        // 3! -> 6
        // dữ liệu để test/ test case/ test data
        //0,1
        //1,1
        //2,2
        //3,6
        //4,24
        
        //1. tạo mảng chứa data. framework/tool có UnitTest xịn 
        //    hỗ trợ kết nối file .csv, table trong DB luôn !!!, File exel
        // để trong mảng trong code cũng được luôn
        
        //trả về mảng 2 chiều [7][2], kiểu Object/ dùng Wrapper class
        // 
        @Parameters
        public static Object[][] initData() {
            return new Integer[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {6,72}
            };
        }
        // có bộ data rồi, ta trích từng cặp ra và test xanh đỏ như cũ
        @Parameter(value = 0) //gắn biến này với cột 0
        public int input; // n, ứng cột 0                   6!
        
        @Parameter(value = 1) // gắn biến này với cột 1
        public long expected; // ứng cột 1 giá trị của n!   720
    
        
        @Test // trích data được rồi, nhồi vào assertEqual
        public void testFactorialGivenValidArgrumentN6ReturnsWell() {
            
            assertEquals(expected, MathUtil.getFactorial(input));
        }
}
