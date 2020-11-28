package cool.smhw.dao.iml;

import cool.smhw.dao.StudentDao;
import cool.smhw.entity.Student;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ImpStudentDao implements StudentDao {

    @Override
    public List<Student> selectStudents() {
        SqlSession session = MybatisUtil.sqlFactory();
        String s = "cool.smhw.dao.StudentDao"+"."+"selectStudents";
        List<Student> students = session.selectList(s);
        session.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = MybatisUtil.sqlFactory();
        String s = "cool.smhw.dao.StudentDao"+"."+"insertStudent";
        int insert = session.insert(s, student);
        session.close();
        return insert;
    }
}
