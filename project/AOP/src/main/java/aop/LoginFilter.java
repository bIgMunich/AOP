package aop;

public class LoginFilter implements MethodAfterAdvise {

    private String name;
    private String password;

    public LoginFilter(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public LoginFilter setPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginFilter setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Object after() {
        if (!name.equals("munich")) {
            return "用户名不对";
        }
        if (!password.equals("123456")) {
            return "密码不对";
        }
        return null;
    }
}
