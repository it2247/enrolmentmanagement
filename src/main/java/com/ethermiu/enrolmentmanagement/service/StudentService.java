package com.ethermiu.enrolmentmanagement.service;

import com.ethermiu.enrolmentmanagement.domain.Offering;
import com.ethermiu.enrolmentmanagement.domain.Section;
import com.ethermiu.enrolmentmanagement.domain.Student;

import java.util.List;

public interface StudentService {
    void create(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudent();
    void update(Long id, Student student);
    void delete(Student student);
    List<Offering> getStuOffering(Long id);
    void updateEnrolment(Long id, Section section);
    void addEnrolment(Long id ,Long sectionId);
}