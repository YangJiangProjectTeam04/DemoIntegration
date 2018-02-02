package com.xiaohei.mapper;

import com.xiaohei.domain.Student;
import com.xiaohei.domain.StudentParameter;

import java.util.List;

public interface StudentDao {

    List<Student> select(Student student);

    Integer getTotalRecord(StudentParameter parameter);

}
