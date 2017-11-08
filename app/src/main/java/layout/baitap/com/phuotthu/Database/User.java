package layout.baitap.com.phuotthu.Database;

/**
 * Created by KIMANH on 11/8/2017.
 */

public class User {
    private int Id;
    private String UserName;
    private String PassWord;

    public User(int id, String userName, String passWord) {
        Id = id;
        UserName = userName;
        PassWord = passWord;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
