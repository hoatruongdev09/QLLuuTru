package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import config.Database;

public class CongDanDao {
	
	public void themCongDan(String ten, String ho, Date ngaySinh, String gioiTinh, String noiSinh, String ttHonNhan, String ngheNghiep) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "INSERT INTO CONGDAN(CmndID,Ten,Ho,NgaySinh,GioiTinh,NoiSinh,TTHonNhan,NgheNghiep) VALUES(?,?,?,?,?,?,?,?)";
		int CmndID = soLuong()+1;
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, CmndID);
		stmt.setString(2, ten);
		stmt.setString(3, ho);
		stmt.setDate(4, ngaySinh);
		stmt.setString(5, gioiTinh);
		stmt.setString(6, noiSinh);
		stmt.setString(7, ttHonNhan);
		stmt.setString(8, ngheNghiep);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
	
	public int soLuong() throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT COUNT(*) FROM CONGDAN";
		PreparedStatement stmt  = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		stmt.close();
		cn.close();
		return count;
	}
}
