package Task2.models;

public class Employee extends Person {
    private int maNhanVien;
    private int trinhDo;
    private String viTri;
    private double luong;
    public Employee(){}

    public Employee(int maNhanVien, int trinhDo, String viTri, double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int maNhanVien, int trinhDo, String viTri, double luong) {
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

    public int getTrinhDo() {
        return trinhDo();
    }
    public void setTrinhDo(int trinhDo){
        trinhDo();
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
    public static int trinhDo(){
        int choice = -1;
        switch (choice){
            case 1:
                System.out.println("Trung cấp");
                break;
        }
       return choice;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "maNhanVien=" + maNhanVien +
                ", trinhDo=" + trinhDo +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

}
