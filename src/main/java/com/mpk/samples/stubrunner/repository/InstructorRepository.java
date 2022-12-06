package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {
    public List<Instructor> findAll() {
        List<Instructor> instructorsList = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            instructorsList.add(new Instructor().builder().id(i).build());
        }
        return instructorsList;
    }
}
