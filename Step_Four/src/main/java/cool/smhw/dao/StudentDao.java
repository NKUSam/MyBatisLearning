package cool.smhw.dao;

import cool.smhw.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();

    public  int insertStudent(Student student);

    //简单，只传一个参数，使用#{x}的时候，x可以去任意字符串
    public List<Student> select(Integer id);


    //复杂，传输多个参数，使用#{x}的时候，首先对参数变量定义别名，然后根据别名传参
    public List<Student> selectStudent(@Param("name") String name, @Param("age") Integer age);

    //复杂，传输对象，使用#{x}的时候，最简单的方式就是直接将成员变量名赋给查询语句
    public List<Student> selectByObject(Student student);
}
