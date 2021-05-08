package log;

import java.util.HashMap;

/**
 * @author coder_tq
 * @Date 2021/5/8 8:22
 */
public class UserDaoImpl implements UserDao{
    /**
     * 这里使用HashMap来模拟数据库。
     */
    HashMap<Integer ,User> map = new HashMap<>();
    public UserDaoImpl() {
        map.put(1,new User("张三",0,"12345@qq.com","123455"));
        map.put(2,new User("王五",1,"1234532@qq.com","123455213"));
        map.put(3,new User("李四",0,"1234512@qq.com","123455123"));
        map.put(4,new User("赵六",1,"123454324@qq.com","123455421"));
    }
    @Override
    public User selectUserById(int id) {
        return map.get(id);
    }
}
