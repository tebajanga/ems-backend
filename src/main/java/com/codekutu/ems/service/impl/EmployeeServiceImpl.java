package com.codekutu.ems.service.impl;

import com.codekutu.ems.dto.EmployeeDto;
import com.codekutu.ems.entity.Employee;
import com.codekutu.ems.mapper.EmployeeMapper;
import com.codekutu.ems.repository.EmployeeRepository;
import com.codekutu.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        // Saving to database;
        Employee savedEmployee =  employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
