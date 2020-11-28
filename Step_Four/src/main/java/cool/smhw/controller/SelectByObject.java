package cool.smhw.controller;

import cool.smhw.dao.StudentDao;
import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectByObject {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.sqlFactory();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1005);
        List<Student> students = dao.selectByObject(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
    }
}
