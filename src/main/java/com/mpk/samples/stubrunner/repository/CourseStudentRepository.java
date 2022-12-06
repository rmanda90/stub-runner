package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Course_Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseStudentRepository {
//    public List<Course_Student> courseStudnetsList = new ArrayList<>();

    public List<Course_Student> findAll() {
        List<Course_Student> courseStudnetsList = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            courseStudnetsList.add(new Course_Student().builder().build());
        }
        return courseStudnetsList;
    }
}
