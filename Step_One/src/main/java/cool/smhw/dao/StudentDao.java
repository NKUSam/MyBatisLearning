package cool.smhw.dao;

import cool.smhw.entity.Student;

import java.util.List;

public interface StudentDao {
    //查询Student表的所有数据
    public List<Student> selectStudents();//对应一个sql的执行

}
