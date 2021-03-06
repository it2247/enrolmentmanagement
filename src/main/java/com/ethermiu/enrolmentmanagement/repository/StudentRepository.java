package com.ethermiu.enrolmentmanagement.repository;


import com.ethermiu.enrolmentmanagement.domain.Offering;
import com.ethermiu.enrolmentmanagement.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
