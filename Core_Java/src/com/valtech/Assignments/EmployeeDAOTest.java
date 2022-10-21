package com.valtech.Assignments;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;
import  com.valtech.Assignments.Employee;
import  com.valtech.Assignments.EmployeeDAO;


public class EmployeeDAOTest {
	
	
//	@Test
//    public void testupdate() throws Exception {
//        EmployeeDAO dao = new EmployeeDAO();
//        dao.updateEmployee(new Employee (1,"sonu",21,1,33000));
//        Employee e = dao.getEmployee(1);
//        assertEquals(e.getId(),1);
//        assertEquals(e.getName(),"sonu");
//        assertEquals(21,e.getAge());
//        assertEquals(1,e.getGender());
//        assertEquals(33000,e.getSalary(),0.00001);
//        
//    }
//	
	@Test
	public void testGetEmployees()throws Exception{
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(dao.count(),dao.getEmployees().size());
	}

	@Test
    public void testGetEmployeesByAge()throws Exception {
        EmployeeDAO dao=new EmployeeDAO();
        assertEquals(1, dao.getEmployeesByAge(21).size());
    }
	
	 @Test
	    public void testGetEmployeesBtwAge()throws Exception {
	        EmployeeDAO dao=new EmployeeDAO();
	        assertEquals(1, dao.getEmployeesBtwAge(24,28).size());
	    }
	
	 

	@Test
	public void testSalarygreaterthan()throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(2, dao.getSalarygreaterthan(35000).size());
	}
	
	@Test
	public  void testSalarylessthan()throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(1, dao.getSalarylessthan(33000).size());
	}
	
	@Test
	public void testmalecount()throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(5, dao.malecount().size());
	}
	@Test
	public void testfemalecount()throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(5, dao.femalecount().size());
	}
	@Test
	public void testOtherscount()throws Exception {
		EmployeeDAO dao=new EmployeeDAO();
		assertEquals(0, dao.Otherscount().size());
	}
	
//	@Test
//	public void testgetEmployee() throws Exception {
//		EmployeeDAO dao =new EmployeeDAO();
//		Employee e=dao.getEmployee(1);
//        assertEquals(1, e.getId());
//        assertEquals(21, e.getAge());
//	}
//	
//	@Test
//public void testsaveEmployee()throws Exception{
//	EmployeeDAO dao=new EmployeeDAO();
//int count=dao.count();
//dao.SaveEmployee(new Employee(9,"amu",22,2,30000));
//assertEquals(count+1,dao.count());
//dao.deleteEmployee(4);
//assertEquals(count,dao.count());
//
//}
}
