package Task2.models;
import Task2.models.type;
public class Customer extends Person {
    private int IDcustom;
    private type customType;
    private String address;

    public Customer(){}

    public Customer(int IDcustom, type customType, String address) {
        this.IDcustom = IDcustom;
        this.customType = customType;
        this.address = address;
    }

    public Customer(String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int IDcustom, type customType, String address) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, eMail);
        this.IDcustom = IDcustom;
        this.customType = customType;
        this.address = address;
    }

    public int getIDcustom() {
        return IDcustom;
    }

    public void setIDcustom(int IDcustom) {
        this.IDcustom = IDcustom;
    }

    public type getCustomType() {
        return customType;
    }

    public void setCustomType(type customType) {
        this.customType = customType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "IDcustom=C" + IDcustom +
                ", customType='" + customType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
