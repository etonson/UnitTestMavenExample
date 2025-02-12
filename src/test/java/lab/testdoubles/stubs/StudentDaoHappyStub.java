package lab.testdoubles.stubs;

import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.entities.Student;

import java.sql.SQLException;

/*
    @author : Eton.lin
    @description 用以測試StudentDao之Happy Path
    @date 2025-02-06 上午 12:08
*/
public class StudentDaoHappyStub implements StudentDao {
    @Override
    public Student findStudentByName(String name) throws SQLException {
        return new Student(name,"rollName");
    }
}
