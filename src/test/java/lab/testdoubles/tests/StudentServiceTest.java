package lab.testdoubles.tests;

import lab.testdoubles.StudentDaoErrorStub;
import lab.testdoubles.StudentDaoHappyStub;
import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.entities.FindStudentResponse;
import lab.testdoubles.services.StudentService;
import lab.testdoubles.services.StudentServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/*
    @author : Eton.lin
    @description 測試
    @date 2025-02-06 上午 12:11
*/
public class StudentServiceTest {
    @Test
    @DisplayName("throw exception")
    public void shouldNotGetStudentWhenDaoThrowsException() throws SQLException {
        StudentDao dao = new StudentDaoErrorStub();
        StudentService service = new StudentServiceImpl(dao);
        String name="test";
        FindStudentResponse resp = service.findStudent(name);
        assertFalse(resp.isSuccess());
    }

    @Test
    @DisplayName("name=test")
    public void shouldNotGetStudentWhenDaoFindStudent() throws SQLException {
        StudentDao dao = new StudentDaoHappyStub();
        StudentService service = new StudentServiceImpl(dao);
        String name="test";
        FindStudentResponse resp = service.findStudent(name);
        assertEquals(name,resp.getStudent().getName());
    }
}
