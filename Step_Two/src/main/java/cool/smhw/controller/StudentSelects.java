package cool.smhw.controller;

import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class StudentSelects {
    public static void main(String[] args) throws IOException {

        SqlSession ss = MybatisUtil.sqlFactory();

        String sqlId = "cool.smhw.dao.StudentDao"+"."+"selectStudents";

        List<Student> students = ss.selectList(sqlId);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ss.close();
    }
}
