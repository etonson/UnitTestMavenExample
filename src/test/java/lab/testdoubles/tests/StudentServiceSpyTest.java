package lab.testdoubles.tests;

import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.services.StudentService;
import lab.testdoubles.services.StudentServiceImpl;
import lab.testdoubles.spy.MethodAudit;
import lab.testdoubles.spy.StudentDaoSpy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    @author : Eton.lin
    @description TODO
    @date 2025-02-11 下午 11:51
*/
public class StudentServiceSpyTest {
    @Test
    public void shouldGetAuditRecordWhenFindStudent(){
        MethodAudit audit = new MethodAudit();
        StudentDao studentDao = new StudentDaoSpy(audit);
        StudentService service = new StudentServiceImpl(studentDao);
        String name = "Jimmy";

        service.findStudent(name);

        assertEquals(1,audit.getInvocationCount("findStudentByName"));
        List<Object> params = audit.getMethodInvocation("findStudentByName",1).getParams();
        assertEquals(name,params.get(0));
    }
}
