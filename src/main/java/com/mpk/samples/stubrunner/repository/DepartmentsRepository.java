package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentsRepository {
    final List<Department> departmentsList = new ArrayList<>();

    public List<Department> findAll() {
        for (int i = 1; i <= 25; i++) {
            departmentsList.add(new Department().builder().id(i).build());
        }
        return departmentsList;
    }
}
