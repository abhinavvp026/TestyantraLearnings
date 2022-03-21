package com.te.learn.interfaces.functionals;

import java.util.Comparator;

public class CompareEmployeeByAge implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee = (Employee) o1;
		Employee employee2 = (Employee) o2;
		if (employee.geteAge() < employee2.geteAge())
			return -1;
		else if (employee.geteAge() > employee2.geteAge())
			return 1;

		return 0;
	}

}
