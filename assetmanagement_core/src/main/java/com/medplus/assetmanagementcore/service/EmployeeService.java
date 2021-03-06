package com.medplus.assetmanagementcore.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.medplus.assetmanagementcore.model.Employee;

public interface EmployeeService 
{
	public String addEmployee(Employee employee,String createdBy,Date createdDate);

	public String updateEmployee(Employee employee,String updatedBy,Date updatedDate);

	public Employee getEmployee(String empId);
	
	public List<Employee> getAllEmployees();

	public boolean authenticateEmployee(String empid,String password);
	
	public String addRoleToEmp(String empId,List<Long> roleIdList, String addedBy,Date addedDate);
	
	public String addRole(int roleId, String roleName, String createdBy, Date createdDate);
	
	public Map<Integer,String> getEmployeeRole(String empid);
	
	public Map<Integer,String> getAllRole();
	
	public int getRoleId(String roleName);
	
	public String removeEmployeeRle(String empid,String removedBy,Date removedDate);
	
	public boolean changePasswordByUser(String empId,String oldPassword,String newPassword);
	
	public boolean changePasswordByAdmin(String empId,String changedBy,String newPassword);

	
}

	

