package com.testing;

import com.testing.mathutil.core.MathUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilDDTTest {

    // Hàm cung cấp dữ liệu test (mảng 2 chiều)
    public static Object[][] initTestData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    // Biến Object[][] thành Stream để JUnit hiểu được
    public static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> dataProvider() {
        Object[][] data = initTestData();
        return java.util.Arrays.stream(data)
                .map(row -> org.junit.jupiter.params.provider.Arguments.of(row[0], row[1]));
    }

    // Test case sử dụng dữ liệu từ dataProvider()
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) throws IllegalAccessException {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
