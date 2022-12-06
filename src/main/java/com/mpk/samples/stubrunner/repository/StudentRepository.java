package com.mpk.samples.stubrunner.repository;

import com.mpk.samples.stubrunner.objects.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

//    public List<Student> studentListList = new ArrayList<>();

    public List<Student> findAll() {
        List<Student> studentListList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            studentListList.add(new Student().builder().id(i).build());
        }
        return studentListList;
    }
}
