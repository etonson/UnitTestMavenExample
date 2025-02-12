package lab.testdoubles.spy;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    @author : Eton.lin
    @description TODO
    @date 2025-02-11 下午 10:47
*/
@Data
public class MethodAudit {
    private Map<String, List<MethodInvocation>> map = new HashMap<>();
    void registerCall(MethodInvocation invocation){
        List<MethodInvocation> list = map.get(invocation.getMethod());
        if(list == null){
            list = new ArrayList<>();
        }
        if(!list.contains(invocation)){
            list.add(invocation);
        }
        map.put(invocation.getMethod(), list);
    }
    public int getInvocationCount(String methodName){
        List<MethodInvocation> list = map.get(methodName);
        if(list == null){
            return 0;
        }
        return list.size();
    }
    public MethodInvocation getMethodInvocation(String methodName,int index){
        List<MethodInvocation> list = map.get(methodName);
        if(list == null|| (index >list.size())){
            return null;
        }
        return list.get(index-1);
    }
}
