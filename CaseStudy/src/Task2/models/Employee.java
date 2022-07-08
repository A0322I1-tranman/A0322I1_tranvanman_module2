package Task2.models;
import Task2.models.Official;
import Task2.models.Level;
import java.util.Scanner;

public class Employee extends Person {
    private Level trinhDo;
    private int maNhanVien;
    private String viTri;
    private double luong;
    private Official office;


    public Employee(){}

    public Employee(int maNhanVien, Level trinhDo, String viTri, double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, long soDienThoai, String eMail, int maNhanVien, Level trinhDo, String viTri,Official office, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, (int) soDienThoai, eMail);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
        this.office = office;
    }

    public Employee(String name, int date, boolean gender, int cmnd, int sdt, String email, int code, Level[] level, String position, Official[] officials, double salary) {
    }


    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Level getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(Level trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Employee(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, Official office) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.office = office;
    }

    public Official getOffice() {
        return office;
    }

    public void setOffice(Official office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "maNhanVien=E" + maNhanVien +
                ", trinhDo=" + trinhDo +
                ", office=" + office +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }


}
