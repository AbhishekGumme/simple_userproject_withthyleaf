package com.simpleUser.Service;

import com.simpleUser.Dto.EmployeeDTO;
import com.simpleUser.Dto.LoginDTO;
import com.simpleUser.payload.LoginMesage;

public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);
}
