package lab.testdoubles.entities;

import lombok.Data;

/*
    @author : Eton.lin
    @description 存放stusent查詢結果
    @date 2025-02-05 下午 11:01
   測試
*/
@Data
public class FindStudentResponse {
    private String errorMessage;
    private Student student;

    public FindStudentResponse(String errorMessage, Student student) {
        this.errorMessage = errorMessage;
        this.student = student;
    }

    public boolean isSuccess() {
        return errorMessage == null;
    }
}
