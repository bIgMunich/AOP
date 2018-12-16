package aop;

public interface MethodAfterAdvise extends AfterAdvise {
    public Object after() throws Throwable;
}
