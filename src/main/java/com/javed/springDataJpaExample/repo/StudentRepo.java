package com.javed.springDataJpaExample.repo;

import com.javed.springDataJpaExample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

   // @Query("SELECT s FROM Student s WHERE s.name = ?1") // ?1 ==> it means 1st parameter like ?2 means 2nd parameter
    List<Student> findByName(String name);

    List<Student> findByMarks(int i);
    List<Student> findByMarksGreaterThan(int i);
}
