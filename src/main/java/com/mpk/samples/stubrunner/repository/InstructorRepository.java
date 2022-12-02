package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {
    final List<Instructor> instructorsList = new ArrayList<>();

    public List<Instructor> findAll() {
        for (int i = 1; i <= 50; i++) {
            instructorsList.add(new Instructor().builder().id(i).build());
        }
        return instructorsList;
    }
}
