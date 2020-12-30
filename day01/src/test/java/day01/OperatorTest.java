package day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OperatorTest {
	
	private final Operator operator = new Operator();
	
	@Test
	void doExpenseReportTest() {
		int result = operator.doExpensesReport();
		System.out.println("1st: "+ result);
		assertTrue(result > 0);
		assertEquals(operator.getFirstValue()* operator.getSecondValue(), result);
	}
	
	@Test
	void setExpensesReportValues() {
		operator.setExpensesReportValues(Input.getInput());
		assertEquals(2020, operator.getFirstValue() + operator.getSecondValue());
	}
	
	@Test
	void doSecondExpenseReportTest() {
		int result = operator.doSecondExpensesReport();
		System.out.println("2nd: " + result);
		assertTrue(result > 0);
		assertEquals(operator.getFirstValue() * operator.getSecondValue() * operator.getThirdValue(), result);
		
	}
	
	@Test
	void setThreeExpensesReportValues() {
		operator.setThreeExpensesReportValues(Input.getInput());
		assertEquals(2020, operator.getFirstValue() + operator.getSecondValue() + operator.getThirdValue());
	}

}
