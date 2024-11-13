package model;

public class Employee {

	private double BASE_SALARY = 1000000;

	public double calculateSalary(String typeCategory) {
		switch (typeCategory) {
		case ("A"):
			double salarioA = this.BASE_SALARY + (0.3 * this.BASE_SALARY);
			salarioA = salarioA - (salarioA * 0.1);
			salarioA = salarioA - (this.BASE_SALARY * 0.12);
			return salarioA;
		case ("B"):
			double salarioB = this.BASE_SALARY + (0.2 * this.BASE_SALARY);
			salarioB = salarioB - (this.BASE_SALARY * 0.12);
			return salarioB;
		case ("C"):
			double salarioC = this.BASE_SALARY + (0.1 * this.BASE_SALARY);
			salarioC = salarioC - (this.BASE_SALARY * 0.12);
			return salarioC;
		default:
			return 0;
		}
	}
}
