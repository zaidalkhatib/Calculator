package edu.csc413.calculator.evaluator;

import edu.csc413.calculator.exceptions.InvalidExpressionException;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.jupiter.api.Assertions.*;

class EvaluatorTest {

    @Test
    void evaluateExpression1() throws InvalidExpressionException {
      Evaluator evaluator = new Evaluator();
          assertThat(evaluator.evaluateExpression("(2+2)/2"),equalTo(2));
    }

    @Test
    void evaluateExpression2() throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateExpression("(4*2)/2"),equalTo(4));
    }

    @Test
    void evaluateExpression3() throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateExpression("(2+10)*2"),equalTo(24));
    }

    @Test
    void evaluateExpression4() throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateExpression("((10+2)*20-10)*2"),equalTo(460));
    }

    @Test
    void evaluateExpression5() throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateExpression("(((11-2)+7+20)*5)"),equalTo(180));
    }

    @Test
    void evaluateSimpleExpression1()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("10*2"),equalTo(20));

    }
    @Test
    void evaluateSimpleExpression2()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("10/5"),equalTo(2));

    }
    @Test
    void evaluateSimpleExpression3()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("30+2"),equalTo(32));

    }
    @Test
    void evaluateSimpleExpression4()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("23-10"),equalTo(13));

    }
    @Test
    void evaluateSimpleExpression5()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("42*3+2-4"),equalTo(124));

    }
    @Test
    void evaluateSimpleExpression6()throws InvalidExpressionException {
        Evaluator evaluator = new Evaluator();
        assertThat(evaluator.evaluateSimpleExpression("10-2/4*4+2"),equalTo(10));

    }
}