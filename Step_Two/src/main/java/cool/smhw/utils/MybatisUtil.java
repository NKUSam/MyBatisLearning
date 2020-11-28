package cool.smhw.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory factory = null;

    static {
        String config = "mybatis.xml";
        InputStream stream = null;
        try {
            stream = Resources.getResourceAsStream(config);

            SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

            factory = factoryBuilder.build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession sqlFactory(){
        SqlSession session = null;
        if (factory != null){
            session = factory.openSession(true);
        }
        return session;
    }
}
