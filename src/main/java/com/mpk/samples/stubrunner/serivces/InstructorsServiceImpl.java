package com.mpk.samples.stubrunner.serivces;

import com.mpk.samples.stubrunner.objects.Instructor;
import com.mpk.samples.stubrunner.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class InstructorsServiceImpl {

    private final InstructorRepository instructorRepository;

    public List<Instructor> findAllInstructors() {
        return instructorRepository.findAll();
    }


}
