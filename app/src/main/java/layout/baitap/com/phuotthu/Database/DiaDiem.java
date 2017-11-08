package layout.baitap.com.phuotthu.Database;

/**
 * Created by KIMANH on 11/8/2017.
 */

public class DiaDiem {

    private int id;
    private String diaDiem;
    private String chiTiet;
    private String hinhAnh;

    public DiaDiem(int id, String diaDiem, String chiTiet, String hinhAnh) {
        this.id = id;
        this.diaDiem = diaDiem;
        this.chiTiet = chiTiet;
        this.hinhAnh = hinhAnh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
