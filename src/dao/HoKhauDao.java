package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.HoKhauBean;
import config.Database;

public class HoKhauDao {
	
	public ArrayList<HoKhauBean> danhSachHoKhau() throws Exception{
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM HOKHAU";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<HoKhauBean> list = new ArrayList<HoKhauBean>();
		HoKhauBean tmp = null;
		while(rs.next()) {
			tmp = new HoKhauBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
			list.add(tmp);
		}
		stmt.close();
		cn.close();
		return list;
	}
	public HoKhauBean layThongTin(int hoKhauId) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM HOKHAU WHERE HoKhauId = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, hoKhauId);
		ResultSet rs = stmt.executeQuery();
		HoKhauBean tmp = null;
		if(rs.next()) {
			tmp = new HoKhauBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
		}
		stmt.close();
		cn.close();
		return tmp;
	}
	public void suaHoKhau(int hoKhauId, String tinh_TP, String quan_Huyen, String phuong_Xa, String to_Thon, int chuHoId) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "UPDATE HOKHAU SET Tinh_TP = ?, Quan_Huyen = ?, Phuong_Xa = ?, To_Thon = ?, ChuHoId = ? WHERE HoKhauId = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setString(1, tinh_TP);
		stmt.setString(2, quan_Huyen);
		stmt.setString(3, phuong_Xa);
		stmt.setString(4, to_Thon);
		stmt.setInt(5, chuHoId);
		stmt.setInt(6, hoKhauId);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
}























