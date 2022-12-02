package com.mpk.samples.stubrunner.serivces;

import com.mpk.samples.stubrunner.objects.Department;
import com.mpk.samples.stubrunner.repository.DepartmentsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DepartmentsServiceImpl {

    private final DepartmentsRepository departmentsRepository;

    public List<Department> findAllDepartments() {
        return departmentsRepository.findAll();
    }


}
