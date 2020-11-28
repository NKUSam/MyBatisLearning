package cool.smhw.controller;

import cool.smhw.dao.StudentDao;
import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.sqlFactory();
        StudentDao dao = session.getMapper(StudentDao.class);


        List<Integer> list = new ArrayList<Integer>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        list.add(1004);
        List<Student> students = dao.selectStudentForEach(list);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
