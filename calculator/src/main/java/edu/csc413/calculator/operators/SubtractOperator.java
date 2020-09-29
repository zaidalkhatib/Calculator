package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends  Operator {
    @Override
    public int precedence() {
        return 1;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        return new Operand(rhs.getValue()-lhs.getValue());
    }
}
