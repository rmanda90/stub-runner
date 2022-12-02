package com.mpk.samples.stubrunner.controller;

import com.mpk.samples.stubrunner.objects.*;
import com.mpk.samples.stubrunner.serivces.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/v1/stubrunner")
@RequiredArgsConstructor
@Slf4j
public class StubRunnerController {

    private final StudentsServiceImpl studentsService;

    private final DepartmentsServiceImpl departmentsService;

    private final CoursesServiceImpl coursesService;

    private final InstructorsServiceImpl instructorsService;

    private final CoursesStudentsServiceImpl coursesStudentsService;

    // http://localhost:8091/v1/stubrunner/students
    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentsService.findAllStudents().stream()
                .sorted(Comparator.comparingInt(Student::id))
                .collect(Collectors.toList());
    }

    // http://localhost:8091/v1/stubrunner/departments
    @GetMapping("/departments")
    public List<Department> findAllDepartments() {
        return departmentsService.findAllDepartments().stream()
                .sorted(Comparator.comparingInt(Department::id))
                .collect(Collectors.toList());
    }

    // http://localhost:8091/v1/stubrunner/courses
    @GetMapping("/courses")
    public List<Course> findAllCourses() {
        return coursesService.findAllCourses().stream()
                .sorted(Comparator.comparingInt(Course::id))
                .collect(Collectors.toList());
    }

    // http://localhost:8091/v1/stubrunner/instructors
    @GetMapping("/instructors")
    public List<Instructor> findAllInstructors() {
        return instructorsService.findAllInstructors().stream()
                .sorted(Comparator.comparingInt(Instructor::id))
                .collect(Collectors.toList());
    }

    // http://localhost:8091/v1/stubrunner/student_courses
    @GetMapping("/student_courses")
    public List<Course_Student> findAllStudentCourses() {
        return coursesStudentsService.findAllStudentCourses().stream()
                .sorted(Comparator.comparingInt(Course_Student::studentId))
                .collect(Collectors.toList());
    }
}
