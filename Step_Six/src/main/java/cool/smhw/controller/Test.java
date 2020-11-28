package cool.smhw.controller;

import cool.smhw.dao.StudentDao;
import cool.smhw.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.sqlFactory();
        StudentDao dao = session.getMapper(StudentDao.class);


    }
}
