package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class MunichAdvise implements InvocationHandler {
    private Object target;
    private List<Advise> adviseList;

    public MunichAdvise(Object target, List<Advise> adviseList) {
        this.target = target;
        this.adviseList = adviseList;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        for (Integer i = 0; i < adviseList.size(); i++) {
            Advise advise = adviseList.get(i);
            if (advise instanceof AfterAdvise) {
                ((MethodAfterAdvise) advise).after();
            }
        }

     /*   adviseList.stream().forEach(m -> {
            if (m instanceof AfterAdvise) {
                ((MethodAfterAdvise) m).after();
            }
        });*/
        return method.invoke(target, args);
    }
}
