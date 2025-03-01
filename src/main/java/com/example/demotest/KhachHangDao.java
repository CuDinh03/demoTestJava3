package com.example.demotest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDao {

    public void insert(KhachHang khachHang) {
        String sql = "INSERT INTO KhachHang (userName, password, hoTen, gioiTinh, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = ConnectionDao.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
//            System.out.println(connection);
            statement.setString(1, khachHang.getUserName());
            statement.setString(2, khachHang.getPassword());
            statement.setString(3, khachHang.getHoTen());
            statement.setBoolean(4, khachHang.getGioiTinh());
            statement.setString(5, khachHang.getEmail());

            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<KhachHang> findAll() {
        String sql = "SELECT * FROM KhachHang";
        List<KhachHang> list = new ArrayList<>();

        try (Connection connection = ConnectionDao.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setUserName(rs.getString("username"));
                khachHang.setPassword(rs.getString("password"));
                khachHang.setHoTen(rs.getString("hoten"));
                khachHang.setGioiTinh(rs.getBoolean("gioitinh"));
                khachHang.setEmail(rs.getString("email"));
                list.add(khachHang);
                System.out.println(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public KhachHang findByHoten(String hoten) {
        return null;
    }

    public void delete(String username) {
        String sql = "DELETE FROM khachhang WHERE userName = ?";

        try (Connection connection = ConnectionDao.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, username);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
