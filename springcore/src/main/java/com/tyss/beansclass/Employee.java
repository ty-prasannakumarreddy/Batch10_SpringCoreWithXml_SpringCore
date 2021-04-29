package com.tyss.beansclass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	public Employee() {
		
	}

	private int empid;
	private String ename;
	
}
