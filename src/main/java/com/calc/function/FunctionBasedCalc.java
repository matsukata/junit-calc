package com.calc.function;

import com.calc.enums.MathOperation;

import java.util.Map;
import java.util.function.BinaryOperator;

import static com.calc.enums.MathOperation.DIVIDE;
import static com.calc.enums.MathOperation.MINUS;
import static com.calc.enums.MathOperation.MULTIPLY;
import static com.calc.enums.MathOperation.PLUS;

public class FunctionBasedCalc {
    Map<MathOperation, BinaryOperator<Integer>> map = Map.of(PLUS, Integer::sum,
            MINUS, (x, y) -> x - y,
            MULTIPLY, (x, y) -> x * y,
            DIVIDE, (x, y) -> x / y);

    public int sum(int a, int b) {
        return map.get(PLUS).apply(a, b);
    }

    public int subtract(int a, int b) {
        return map.get(MINUS).apply(a, b);
    }

    public int multiply(int a, int b) {
        return map.get(MULTIPLY).apply(a, b);
    }

    public double divide(int a, int b) {
        return map.get(DIVIDE).apply(a, b);
    }
}
