package com.mpk.samples.stubrunner.serivces;

import com.mpk.samples.stubrunner.objects.Course_Student;
import com.mpk.samples.stubrunner.repository.CourseStudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class CoursesStudentsServiceImpl {

    private final CourseStudentRepository courseStudentRepository;

    public List<Course_Student> findAllStudentCourses() {
        return courseStudentRepository.findAll();
    }


}
