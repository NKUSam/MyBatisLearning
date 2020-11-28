package cool.smhw.controller;

import cool.smhw.dao.StudentDao;
import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.sqlFactory();
        StudentDao dao = session.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("张飞");
//        student.setAge(20);
        List<Student> students = dao.selectStudentWhere(student);

        for (Student student1 : students) {
            System.out.println(student1);
        }
    }
}
