package lab.testdoubles.entities;

import lombok.Data;

/*
    @author : Eton.lin
    @description 測試物件
    @date 2025-02-05 下午 10:48
*/
@Data
public class Student {
    String name;
    String rollName;

    public Student(String name, String rollName) {
        this.name = name;
        this.rollName = rollName;
    }
}
