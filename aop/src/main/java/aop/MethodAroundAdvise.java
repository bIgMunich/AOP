package aop;

public interface MethodAroundAdvise extends AroundAdvise {
    public Object around() throws Throwable;
}
