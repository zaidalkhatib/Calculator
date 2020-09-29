package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class DivideOperatorTest {

    @Test
    void precedence() {
        DivideOperator divideOperator = new DivideOperator();
        assertThat(divideOperator.precedence(), equalTo(2) );
    }

    @Test
    void execute() {
        DivideOperator divideOperator = new DivideOperator();
        Operand op1 = new Operand(10);
        Operand op2 = new Operand(5);
        assertThat(divideOperator.execute(op2,op1).getValue(), equalTo(2));
    }
}