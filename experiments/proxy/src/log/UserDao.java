package log;

/**
 * @author coder_tq
 * @Date 2021/5/8 8:29
 */
public interface UserDao {
    /**
     * 按照id来查询用户
     * @param id 用户的id
     * @return 查询到的用户信息
     */
    User selectUserById(int id);
}
