package com.example.demotest;

public class KhachHang {

    private String userName;
    private String password;
    private String hoTen;
    private Boolean gioiTinh;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public KhachHang() {
    }

    public KhachHang(String userName, String password, String hoTen, Boolean gioiTinh, String email) {
        this.userName = userName;
        this.password = password;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", email='" + email + '\'' +
                '}';
    }
}
