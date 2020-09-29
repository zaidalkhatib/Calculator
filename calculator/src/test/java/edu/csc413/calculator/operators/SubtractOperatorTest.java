package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class SubtractOperatorTest {


    @Test
    void precedence() {
        SubtractOperator subtractOperator = new SubtractOperator();
        assertThat(subtractOperator.precedence(), equalTo(1) );
    }

    @Test
    void execute() {
        SubtractOperator subtractOperator = new SubtractOperator();
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(2);

        assertThat( subtractOperator.execute(op2, op1).getValue(), equalTo(3));
    }
}