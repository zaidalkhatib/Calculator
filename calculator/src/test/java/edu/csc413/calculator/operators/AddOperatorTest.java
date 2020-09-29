package edu.csc413.calculator.operators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

class AddOperatorTest {


    @Test
    void precedence()   {
        AddOperator addOperator = new AddOperator();
        assertThat(addOperator.precedence(), equalTo(1) );
    }

    @Test
    void execute() {
        AddOperator addOperator = new AddOperator();
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(2);

        assertThat( addOperator.execute(op1, op2).getValue(), equalTo(4));
    }
}