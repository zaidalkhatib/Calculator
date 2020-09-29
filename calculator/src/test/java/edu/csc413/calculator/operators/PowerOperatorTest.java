package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class PowerOperatorTest {

    @Test
    void precedence() {
        PowerOperator powerOperator = new PowerOperator();
        assertThat(powerOperator.precedence(), equalTo(3) );
    }

    @Test
    void execute() {
        PowerOperator powerOperator = new PowerOperator();
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        assertThat(powerOperator.execute(op2,op1).getValue(), equalTo(8));
    }
}