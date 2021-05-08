package log;

/**
 * @author coder_tq
 * @Date 2021/5/8 8:22
 */
public class User {
    String name;
    int sex;
    String email;
    String password;

    /**
     * 下面是getter和setter等方法
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, int sex, String email, String password) {
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
