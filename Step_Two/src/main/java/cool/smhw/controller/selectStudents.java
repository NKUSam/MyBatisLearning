package cool.smhw.controller;

import cool.smhw.dao.iml.ImpStudentDao;
import cool.smhw.entity.Student;

import java.util.List;

public class selectStudents {
    public static void main(String[] args) {
        ImpStudentDao impStudentDao = new ImpStudentDao();
        List<Student> students = impStudentDao.selectStudents();
        for (Student s:students) {
            System.out.println(s);
        }
    }
}
