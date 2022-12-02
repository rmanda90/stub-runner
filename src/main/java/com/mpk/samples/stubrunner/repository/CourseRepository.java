package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    final List<Course> courseList = new ArrayList<>();

    public List<Course> findAll() {
        for (int i = 1; i <= 50; i++) {
            courseList.add(new Course().builder().id(i).build());
        }
        return courseList;
    }
}
