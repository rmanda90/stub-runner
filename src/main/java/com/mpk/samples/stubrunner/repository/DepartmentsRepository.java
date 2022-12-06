package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class DepartmentsRepository {
//    public List<Department> departmentsList = new ArrayList<>();

    public List<Department> findAll() {
        List<Department> departmentsList = new ArrayList<>();
        
        for (int i = 0; i < 25; i++) {
            String departmentNameByIndex = new Department().getDepartmentNameByIndex(i);
            departmentsList.add(new Department().builder()
                    .id(i+1)
                    .departmentName(departmentNameByIndex).build());
        }
        return departmentsList;
    }
}
