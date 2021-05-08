package log;

/**
 * @author coder_tq
 * @Date 2021/5/8 8:34
 */
public class Main {
    public static void main(String[] args) {
        UserDao userDaoLog = new UserDaoLog(new UserDaoImpl());
        User user = userDaoLog.selectUserById(1);
    }
}
