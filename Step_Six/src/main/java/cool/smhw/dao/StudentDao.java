package cool.smhw.dao;

import cool.smhw.entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> selectStudentIf(Student student);

    public List<Student> selectStudentWhere(Student student);

    public List<Student> selectStudentForEach(List<Integer> list);

}
