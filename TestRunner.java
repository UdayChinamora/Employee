/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 23, 2023
*/
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Result result = JUnitCore.runClasses(TestEmployeeLogic.class);
		
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			
			
		}
		System.out.println(result.wasSuccessful());
	}


	}


