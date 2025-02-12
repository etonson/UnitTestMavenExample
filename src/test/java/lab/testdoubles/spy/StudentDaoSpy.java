package lab.testdoubles.spy;

import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.entities.Student;

import java.sql.SQLException;

/*
    @author : Eton.lin
    @description TODO
    @date 2025-02-11 下午 10:51
*/
public class StudentDaoSpy implements StudentDao {
    private MethodAudit audit;

    public StudentDaoSpy(MethodAudit audit) {
        this.audit = audit;
    }

    @Override
    public Student findStudentByName(String name) throws SQLException {
        audit(name);
        return new Student(name,name);
    }

    private void audit(String name) {
        MethodInvocation invocation = new MethodInvocation();
        invocation.addParam(name).setMethod("findStudentByName");
        audit.registerCall(invocation);
    }
}
