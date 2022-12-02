package com.mpk.samples.stubrunner.serivces;

import com.mpk.samples.stubrunner.objects.Student;
import com.mpk.samples.stubrunner.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class StudentsServiceImpl {

    private final StudentRepository studentRepository;

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }


}
