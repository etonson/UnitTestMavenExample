package lab.testdoubles.services;

import lab.testdoubles.entities.FindStudentResponse;

/*
    @author : Eton.lin
    @description 存放student之服務
    @date 2025-02-05 下午 11:15
*/
public interface StudentService {
    FindStudentResponse findStudent(String name);
}
