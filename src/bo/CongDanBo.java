package bo;

import java.sql.Date;

import dao.CongDanDao;

public class CongDanBo {
	
	private CongDanDao congDanDao;
	
	public CongDanBo() {
		congDanDao = new CongDanDao();
	}
	
	public void themCongDan(String ten, String ho, Date ngaySinh, String gioiTinh, String noiSinh, String ttHonNhan, String ngheNghiep) throws Exception {
		congDanDao.themCongDan(ten, ho, ngaySinh, gioiTinh, noiSinh, ttHonNhan, ngheNghiep);
	}
	public int soLuong() throws Exception {
		return congDanDao.soLuong();
	}
}
