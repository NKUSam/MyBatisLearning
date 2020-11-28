package cool.smhw.dao;

import cool.smhw.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> selectStudentIf(Student student);

}
