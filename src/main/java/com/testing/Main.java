package com.testing;

import com.testing.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }

    //TEST CASE #1: Check/Verify Check getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 0
    //2. Call/invoke getFactorial(n=0)
    //3. Execute
    //EXPECTED RESULT:
    // The method will return 1 as the result of 0!
    public static void testFactorialGivenRightArg0RunsWell() throws IllegalAccessException {
        int n = 0; // đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng thay

       //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //test, so sánh actual vs. expected
        //dùng biến boolean hoặc in ra
        System.out.println("0! expected: " + expectedValue);
        System.out.println("0! actual: " + actualValue);
    }

    //TEST CASE #1: Check/Verify Check getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 0
    //2. Call/invoke getFactorial(n=0)
    //3. Execute
    //EXPECTED RESULT:
    // The method will return 1 as the result of 0!
    public  static void testFactorialGivenRightArg5RunsWell() throws IllegalAccessException {
        int n = 5; // đầu vào
        long expectedValue = 120; //hope to see 0! = 1, kì vọng thay

        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //test, so sánh actual vs. expected
        //dùng biến boolean hoặc in ra
        System.out.println("5! expected: " + expectedValue);
        System.out.println("5! actual: " + actualValue);
    }

    public  static void testFactorialGivenRightArg6RunsWell() throws IllegalAccessException {
        int n = 6; // đầu vào
        long expectedValue = 720; //hope to see 0! = 1, kì vọng thay

        //gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);
        //test, so sánh actual vs. expected
        //dùng biến boolean hoặc in ra
        System.out.println("6! expected: " + expectedValue);
        System.out.println("6! actual: " + actualValue);
    }

    //TEST CASE #4: CHECK/VERIFY getFactorial()method with INvalid parameter, e.g. n = -5
    //STEPS/PROCEDURE
    // 1. Give an invalid n, e.g. n = -5
    // 2. Call/ invoke getFactorial(n=-5)
    // 3. Execute
    // Expected result
    //the method will throw an exception
    //STATUS:
    public static void testFactorialGivenWrongArgMinus5ThrowsException() throws IllegalAccessException {
        try {
            MathUtility.getFactorial( -5); //PASS, VÌ KÌ VỌNG NGOẠI LỆ XUẤT HIỆN, VÀ NGOẠI LỆ XUẤT HIỆN THẬT
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        //THẤY NGỌAI LỆ MÀ PASSED LÀ TÌNH HUỐNG TA THIẾT KẾ HÀM SẼ XẢY RA NGOẠI LỆ VỚI SỐ ÂM GIAI THỪA!
    }
}