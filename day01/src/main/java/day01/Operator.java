package day01;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private int firstValue = 0;
	private int secondValue = 0;
	private int thirdValue = 0;

	public int getFirstValue() {
		return firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public int getThirdValue() {
		return this.thirdValue;
	}

	public void setExpensesReportValues(List<Integer> expenses) {
		expenses.stream().forEach(v -> expenses.stream().forEach(h -> {
			if (v + h == 2020) {
				this.firstValue = v;
				this.secondValue = h;
			}
		}));
	}

	public int doExpensesReport() {
		this.setExpensesReportValues(Input.getInput());
		return this.firstValue * this.secondValue;
	}

	public void setThreeExpensesReportValues(List<Integer> input) {
		input.stream().forEach(v -> input.stream().forEach(h -> input.stream().forEach(i -> {
			if (v + h + i == 2020) {
				this.firstValue = v;
				this.secondValue = h;
				this.thirdValue = i;
			}
		})));
	}

	public int doSecondExpensesReport() {
		this.setThreeExpensesReportValues(Input.getInput());
		return this.firstValue * this.secondValue * this.thirdValue;
	}

}
