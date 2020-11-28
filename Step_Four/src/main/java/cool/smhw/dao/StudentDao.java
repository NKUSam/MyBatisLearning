package cool.smhw.dao;

import cool.smhw.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();

    public  int insertStudent(Student student);

    public List<Student> select(Integer id);
}
