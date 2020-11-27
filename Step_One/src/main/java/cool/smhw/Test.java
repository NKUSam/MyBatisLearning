package cool.smhw;

import cool.smhw.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(is);
        SqlSession ss = ssf.openSession();
        String sqlId = "cool.smhw.dao.StudentDao"+"."+"selectStudents";
        List<Student> students = ss.selectList(sqlId);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ss.close();
    }
}
