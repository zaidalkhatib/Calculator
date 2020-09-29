package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends  Operator {


    @Override
    public int precedence() {
        return 2;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        return new Operand(rhs.getValue()/lhs.getValue());
    }
}
