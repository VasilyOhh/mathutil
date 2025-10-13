package com.testing.mathutil.core;

public class MathUtility {

    //class này chứa các hàm tiện ích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó ko lưu lại kết quả xử lý của nó bên trong, vậy nó sẽ được thiết kế là static method

    // hàm tính n! = 1.2.3...n; trong đó n phải > 0
    // quy ước 0! =1, 1 ! = 1, 2! = 1*2 = 2...
    // 20! vừa ủ kiểu long, 18 con số 0; 21! long chứ ako nổi
    // ko có âm giai thừa
    // bài này giai thừa tính từ 0...20, ngoài vùng này gọi là k hợp lệ n
    // 0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    // 0, 20 -> boundary value - biên giới của tập giá trị
    // xích qua 1 xíu là snag vùng invalid boundary
    // 0, xích nhẹ sang trái 1 đơn vị, ko tính được

    public static long getFactorial(int n) throws IllegalAccessException {
        if (n < 0 || n > 20) {
            //ném ngoại lệ, kèm câu thông báo, và dừng ngay, ko có value nào được trả về
            throw new IllegalAccessException("n must be between 0 and 20");
        }

        //biến trung gian để tính phép nhân
        long result  = 1;

        for (int i = 1; i <= n; i++) {
            result *= i; // result = result * i
        }
        return result;
    }
}
