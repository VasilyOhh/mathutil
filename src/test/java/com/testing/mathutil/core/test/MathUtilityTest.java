package com.testing.mathutil.core.test;

import com.testing.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
//import static ch dành cho những hàm static, để giúp ta làm bếng gõ tên class chấm. Lẽ ra phải là MathUtility.getFactorial(2);
//thì nay chỉ cần gõ getFactorial(5); là đủ
//giả sử class có nhiều hàm static thì chỉ cần *
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArg0RunsWell() throws IllegalAccessException {
        int n = 0; // đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng thay
        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        //so sánh xem 0! có trả về con số 1 hay không
        assertEquals(1, MathUtility.getFactorial(0));
        //hàm assertEquals() so sánh giúp mình 2 value này, cho ra 2 màu
        //xanh passed nếu cả 2 bằnd nhau
        //màu đỏ nếu cả 2 ko bằng nhau
    }

    @Test
    public void testFactorialGivenRightArg3RunsWell() throws IllegalAccessException {
        assertEquals(6, MathUtility.getFactorial(3));
    }



    @Test //@Test là ghi chú, đánh dấu, ký hiệu - annotation báo hiệu rằng hàm này là hàm main() có thể run
        //1 class test có thể có nhiều @Test, vậy 1 clas Test có thể có nhiều hàm main() - để ứng với nhiều kịc hbản test, nhiều test case
        //khác nhau đều được run
    void getFactorial() {
    }

}