package aop;

public interface MethodBeforeAdvise extends BeforeAdvise {
    public Object before() throws Throwable;
}
