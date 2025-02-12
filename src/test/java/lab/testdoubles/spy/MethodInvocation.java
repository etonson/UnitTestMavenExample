package lab.testdoubles.spy;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;

import java.util.List;

/*
    @author : Eton.lin
    @description 紀錄稽核相關紀錄
    @date 2025-02-11 下午 10:32
*/
@Getter
public class MethodInvocation {
    private List<Object> params;
    private Object returnValue;
    private String method;

    public MethodInvocation addParam(Object param){
        getParams().add(param);
        return this;
    }
    public MethodInvocation setReturnValue(Object returnValue){
        this.returnValue = returnValue;
        return this;
    }
    public MethodInvocation setMethod(String method){
        this.method = method;
        return this;
    }
}
