package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.CongDanBean;
import bean.HoKhauBean;
import bean.LichSuLuuTru;
import bean.LoaiLuuTruBean;
import bean.Mix;
import config.Database;

public class LichSuLuuTruDao {

	public ArrayList<Mix> layLichSuLuuTru(int cmndId) throws Exception{
		Connection cn = Database.KetNoi();
		String sql = "SELECT CONGDAN.CmndID,CONGDAN.Ho,CONGDAN.Ten,HOKHAU.HoKhauId,HOKHAU.Tinh_TP,HOKHAU.Quan_Huyen,HOKHAU.Phuong_Xa,HOKHAU.To_Thon, LichSuLuuTru.ThoiGianBatDauLT, LichSuLuuTru.ThoiGianKetThucLT, LoaiLuuTru.TenLoaiLuuTru FROM CONGDAN LEFT JOIN LichSuLuuTru ON CONGDAN.CmndID = LichSuLuuTru.CmndID LEFT JOIN LoaiLuuTru ON LichSuLuuTru.LoaiLuuTruID = LoaiLuuTru.LoaiLuuTruID LEFT JOIN HOKHAU ON LichSuLuuTru.HoKhauID = HOKHAU.HoKhauId WHERE CONGDAN.CmndID = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, cmndId);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Mix> list = new ArrayList<Mix>();
		Mix tmp = null;
		while(rs.next()) {
			CongDanBean cd = new CongDanBean(rs.getInt(1), rs.getString(2), rs.getString(3), null, null, null, null);
			HoKhauBean hk = new HoKhauBean(rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), -1);
			LichSuLuuTru lichsu = new LichSuLuuTru(rs.getInt(1), rs.getInt(4), -1, rs.getDate(9), rs.getDate(10), null);
			LoaiLuuTruBean loaiLT = new LoaiLuuTruBean(-1, rs.getString(11));
			Mix m = new Mix(cd, hk, lichsu, loaiLT);
			list.add(m);
		}
		stmt.close();
		cn.close();
		return list;
	}
	public void xoaLichSuLuuTru(int cmndId, int hokhauId, Date ngayBatDau) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "DELETE FROM LichSuLuuTru WHERE CmndID = ? AND HoKhauID = ? AND ThoiGianBatDauLT = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, cmndId);
		stmt.setInt(2, hokhauId);
		stmt.setDate(3, ngayBatDau);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}

}






