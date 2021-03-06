/**
 * @Author: MuYa
 * @Date : 2018/3/30
 * @Time : 9:59
 * @Description: 静态代理
 */
public class UserDaoProxy implements IUserDao ,CarDao {
    //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }

    @Override
    public void price() {
        System.out.println("price开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("price 提交事务...");
    }
}
