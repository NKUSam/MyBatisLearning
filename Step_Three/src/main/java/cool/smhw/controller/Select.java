package cool.smhw.controller;

import cool.smhw.dao.StudentDao;
import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Select {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.sqlFactory();
        //使用了MyBatis的动态代理，自动生成实现类
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        Student student = new Student();
        student.setId(1005);
        student.setName("关羽");
        student.setEmail("guanyu@163.com");
        student.setAge(22);
        int insertStudent = dao.insertStudent(student);
        System.out.println(insertStudent);
    }
}
