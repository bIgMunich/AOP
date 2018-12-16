package aop;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TestDemo1 {

    @Test
    public void demo1() {
        TargetService target = new TargetServiceImpl();
        LoginFilter loginFilter = new LoginFilter("admin", "12345");

        //aspect
        List<Advise> list = new ArrayList<>();
        list.add(loginFilter);

        //如何创建动态代理（百度）
    /*    就此，一个动态代理对象就创建完毕，当然，上面四个步骤可以通过Proxy类的newProxyInstances方法来简化：
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new MyInvocationHandler<Person>(stu);
        //创建一个代理对象stuProxy，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);*/

        MunichAdvise aspecta=new MunichAdvise(target,list);
        TargetService proexyObject=(TargetService)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                aspecta
        );

        proexyObject.search();
    }


}
