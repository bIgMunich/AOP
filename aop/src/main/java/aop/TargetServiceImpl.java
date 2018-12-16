package aop;

public class TargetServiceImpl implements TargetService {


    @Override
    public void search() {
        System.out.print("正在查找中,请稍等,谢谢");
    }
}
