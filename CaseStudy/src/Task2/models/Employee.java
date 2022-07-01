package Task2.models;

import java.util.Scanner;

public class Employee extends Person {
    private int maNhanVien;
    private level trinhDo;
    private Office office;
    private String viTri;
    private double luong;
    enum Office{
        Reception,
        Service,
        Experts,
        Monitor,
        Manage,
        Direction
    }
    enum level{
        Trungcap,
        Caodang,
        Daihoc,
        Saudaihoc
    }
    public Employee(){}

    public Employee(int maNhanVien, level trinhDo, String viTri, double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int maNhanVien, level trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public level getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(level trinhDo) {
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

    public Employee(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, Office office) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.office = office;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "maNhanVien=E" + maNhanVien +
                ", trinhDo=" + trinhDo +
                ", office=" + office +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }


}
