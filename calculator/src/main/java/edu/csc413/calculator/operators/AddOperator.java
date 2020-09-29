package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class AddOperator extends Operator {
    @Override
    public int precedence() {
        return 1;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        return new Operand(lhs.getValue() + rhs.getValue());
    }

}
