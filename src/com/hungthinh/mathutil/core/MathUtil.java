/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungthinh.mathutil.core;

/**
 *
 * @author HungThinh
 */
// Class này chứa các hàm tiện ích liên qua đến toán học
// để dùng cho các tính toán phức tạp sau này
// tiện ích nghĩa là ai cũng cần dùng, đồ dùng chung
// do đó hàm sẽ mang danh nghĩa STATIC
public class MathUtil {
    
    //hàm này nhận vào n và trả về n! = 1.2.3...n
    // n! giá trị tăng rất nhanh
    // nên có những qui ước sau
    // 20! vừa đủ cho kiểu long, 18 số 0
    // ko có âm giai thừa
    // 0! = 1! = 1
    public static long getFactorial(int n) {
        long product = 1;
        
        if(n >20 || n <0)
            throw new IllegalArgumentException("n must me between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        for (int i = 2; i < n; i++) 
            product *= i; 
        
            return product;
    }
}
