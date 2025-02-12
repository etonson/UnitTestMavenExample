package lab.testdoubles.stubs;

import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.entities.Student;

import java.sql.SQLException;

/*
    @author : Eton.lin
    @description 用以測試StudentDao之拋出例外
    @date 2025-02-05 下午 11:52
*/
public class StudentDaoErrorStub implements StudentDao {
    @Override
    public Student findStudentByName(String name) throws SQLException {
        throw new SQLException("DB connection timed out");
    }
}
