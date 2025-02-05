package lab.testdoubles.daos;

import lab.testdoubles.entities.Student;

import java.sql.SQLException;

/*
    @author : Eton.lin
    @description dao for student
    @date 2025-02-05 下午 10:47
*/
public interface StudentDao {
    Student findStudentByName(String name) throws SQLException;
}
