package lab.testdoubles.services;

import lab.testdoubles.daos.StudentDao;
import lab.testdoubles.entities.FindStudentResponse;
import lab.testdoubles.entities.Student;

/*
    @author : Eton.lin
    @description 實作StudentService
    @date 2025-02-05 下午 11:17
*/
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public FindStudentResponse findStudent(String name) {
        FindStudentResponse findStudentResponse;
        try{
            Student student=studentDao.findStudentByName(name);
            findStudentResponse=new FindStudentResponse(null,student);
        }catch (Exception e){
            findStudentResponse=new FindStudentResponse(e.getMessage(),null);
        }
        return findStudentResponse;
    }
}
