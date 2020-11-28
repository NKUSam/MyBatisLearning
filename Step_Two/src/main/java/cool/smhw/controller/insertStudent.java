package cool.smhw.controller;

import cool.smhw.dao.iml.ImpStudentDao;
import cool.smhw.entity.Student;

public class insertStudent {
    public static void main(String[] args) {
        ImpStudentDao impStudentDao = new ImpStudentDao();
        Student student = new Student();
        student.setId(1004);
        student.setName("王五");
        student.setEmail("wangwu@163.com");
        student.setAge(20);
        int insertStudent = impStudentDao.insertStudent(student);
        System.out.println(insertStudent);
    }
}
