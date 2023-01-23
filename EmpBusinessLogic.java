/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 23, 2023
*/
package model;

/**
 * @author uchin
 *
 */
public class EmpBusinessLogic {
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12 ;
		return yearlySalary;
	}
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		}
		else {
			appraisal = 1000;
		}
		return appraisal;
	}
	
	
	public boolean isRetirementAge(Employee employee) {
		boolean  isRetired = false;
		if (employee.getAge() > 65) {
			isRetired= true;
		}
		else {
			isRetired = false;
		}
		return isRetired;
	}

}
