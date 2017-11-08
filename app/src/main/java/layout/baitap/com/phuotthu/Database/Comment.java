package layout.baitap.com.phuotthu.Database;

/**
 * Created by KIMANH on 11/8/2017.
 */

public class Comment {
    private int id;
    private String noiDung;
    private int id_user;
    private int id_diadiem;

    public Comment(int id, String noiDung, int id_user, int id_diadiem) {
        this.id = id;
        this.noiDung = noiDung;
        this.id_user = id_user;
        this.id_diadiem = id_diadiem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_diadiem() {
        return id_diadiem;
    }

    public void setId_diadiem(int id_diadiem) {
        this.id_diadiem = id_diadiem;
    }
}
