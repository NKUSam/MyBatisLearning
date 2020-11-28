package cool.smhw.controller;

import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class StudentInsert {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = MybatisUtil.sqlFactory();

        String sqlId = "cool.smhw.dao.StudentDao"+"."+"insertStudent";

        Student student = new Student();
        student.setId(1003);
        student.setName("张飞");
        student.setEmail("zhangfei@163.com");
        student.setAge(20);

        int nums = sqlSession.insert(sqlId,student);

        sqlSession.commit();

        System.out.println(nums);

        sqlSession.close();
    }
}
