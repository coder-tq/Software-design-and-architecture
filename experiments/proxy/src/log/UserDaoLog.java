package log;

/**
 * @author coder_tq
 * @Date 2021/5/8 8:30
 */
public class UserDaoLog implements UserDao {
    private final UserDao userDao;
    public UserDaoLog(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User selectUserById(int id) {
        System.out.println("log::调用查询用户方法，id为: "+id);
        User user = userDao.selectUserById(id);
        System.out.println("log::查询用户方法结束，查询到的用户信息如下");
        System.out.println("log::"+user);
        return user;
    }
}
