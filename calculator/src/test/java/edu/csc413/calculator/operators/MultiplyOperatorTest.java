package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MultiplyOperatorTest {

    @Test
    void precedence() {
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        assertThat(multiplyOperator.precedence(), equalTo(2) );
    }

    @Test
    void execute() {
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(2);

        assertThat( multiplyOperator.execute(op1, op2).getValue(), equalTo(4));
    }
}