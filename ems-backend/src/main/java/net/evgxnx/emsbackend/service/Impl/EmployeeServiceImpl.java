package net.evgxnx.emsbackend.service.Impl;

import lombok.AllArgsConstructor;
import net.evgxnx.emsbackend.dto.EmployeeDto;
import net.evgxnx.emsbackend.entity.Employee;
import net.evgxnx.emsbackend.mapper.EmployeeMapper;
import net.evgxnx.emsbackend.repository.EmployeeRepository;
import net.evgxnx.emsbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployeee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployeee);
    }
}
