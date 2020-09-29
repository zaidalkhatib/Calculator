package edu.csc413.calculator.operators;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class OperatorTest {
    @Test
    void create_subtract() {
        Operator op = Operator.create("-");
        SubtractOperator subtractOperator = new SubtractOperator();
        assertThat(op.getClass(),equalTo(subtractOperator.getClass()));
    }
    @Test
    void create_add() {
        Operator op = Operator.create("+");
        AddOperator addOperator = new AddOperator();
        assertThat(op.getClass(),equalTo(addOperator.getClass()));
    }
    @Test
    void create_division() {
        Operator op = Operator.create("/");
        DivideOperator divideOperator = new DivideOperator();
        assertThat(op.getClass(),equalTo(divideOperator.getClass()));
    }
    @Test
    void create_multiply() {
        Operator op = Operator.create("*");
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        assertThat(op.getClass(),equalTo(multiplyOperator.getClass()));
    }
    @Test
    void create_power() {
        Operator op = Operator.create("^");
        PowerOperator powerOperator = new PowerOperator();
        assertThat(op.getClass(),equalTo(powerOperator.getClass()));
    }

}