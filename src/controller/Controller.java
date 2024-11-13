package controller;

import model.Employee;
import view.View;

public class Controller {

	private View view = new View();
	private Employee employee = new Employee();
	
	public Controller() {
		this.run();
	}
	
	public void run() {
		double employeeA = this.employee.calculateSalary("A");
		double employeeB = this.employee.calculateSalary("B");
		double employeeC = this.employee.calculateSalary("C");
		this.view.print("El salario para el empleado de categoría A es: " + employeeA);
		this.view.print("El salario para el empleado de categoría B es: " + employeeB);
		this.view.print("El salario para el empleado de categoría C es: " + employeeC);
	}
	
}
