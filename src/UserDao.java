/**
 * @Author: MuYa
 * @Date : 2018/3/30
 * @Time : 9:59
 * @Description:
 */
public class UserDao implements IUserDao ,CarDao{
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }

    @Override
    public void price() {
        System.out.println("----已经保存price数据!----");
    }
}
