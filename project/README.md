1.切面名词解释
   1.通知(Advice)    你想要处理的逻辑思维  例子：是否登录  类名： LoginFilter(class)
   2.连接点（JoinPoint）就是spring允许你是通知（Advice）的地方  列子：前置、后置、环绕，类名：BeforeAdvise等
   3.切入点（Pointcut）你的一个类里，有15个方法，那就有十几个连接点了对吧，但是你并不想在所有方法附件都使用通知（你只是想让其中几个，在调用这几个方法之前、之后或者抛出异常时干点什么，那么就用切入点来定义这几个方法，让切点来筛选连接点，选中那几个你想要的方法。  MethodAroundAdvise
  4.切面（Aspect） 切面是通知和切入点的结合。通知说明了干什么和什么时候干（什么时候通过方法名中的befor，after，around等就能知道），而切入点说明了在哪干（指定到底是哪个方法），这就是一个完整的切面定义
2.动态代理
   //创建一个与代理对象相关联的InvocationHandler
  InvocationHandler stuHandler = new MyInvocationHandler<Person>(stu);
//创建一个代理对象stuProxy，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
  Person stuProxy= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
  参考地址：https://www.cnblogs.com/gonjan-blog/p/6685611.html