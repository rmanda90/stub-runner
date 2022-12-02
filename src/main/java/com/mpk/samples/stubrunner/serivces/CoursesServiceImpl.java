package com.mpk.samples.stubrunner.serivces;

import com.mpk.samples.stubrunner.objects.Course;
import com.mpk.samples.stubrunner.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class CoursesServiceImpl {

    private final CourseRepository courseRepository;

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }


}
