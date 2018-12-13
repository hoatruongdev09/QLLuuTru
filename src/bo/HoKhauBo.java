package bo;

import java.util.ArrayList;

import bean.HoKhauBean;
import dao.HoKhauDao;

public class HoKhauBo {
	
	private HoKhauDao hoKhauDao;
	
	public HoKhauBo() {
		hoKhauDao = new HoKhauDao();
	}
	
	public ArrayList<HoKhauBean> danhSachHoKhau() throws Exception{
		return hoKhauDao.danhSachHoKhau();
	}
	public HoKhauBean layThongTin(int hoKhauId) throws Exception {
		return hoKhauDao.layThongTin(hoKhauId);
	}
	public void suaHoKhau(int hoKhauId, String tinh_TP, String quan_Huyen, String phuong_Xa, String to_Thon, int chuHoId) throws Exception {
		hoKhauDao.suaHoKhau(hoKhauId, tinh_TP, quan_Huyen, phuong_Xa, to_Thon, chuHoId);
	}
	
}
