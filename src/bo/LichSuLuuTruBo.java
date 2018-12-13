package bo;

import java.sql.Date;
import java.util.ArrayList;

import bean.Mix;
import dao.LichSuLuuTruDao;

public class LichSuLuuTruBo {
	
	private LichSuLuuTruDao lsLuuTruDao;
	
	public LichSuLuuTruBo() {
		lsLuuTruDao = new LichSuLuuTruDao();
	}
	
	public ArrayList<Mix> layLichSuLuuTru(int cmndId) throws Exception{
		return lsLuuTruDao.layLichSuLuuTru(cmndId);
	}
	public void xoaLichSuLuuTru(int cmndId, int hokhauId, Date ngayBatDau) throws Exception {
		lsLuuTruDao.xoaLichSuLuuTru(cmndId, hokhauId, ngayBatDau);
	}
	
}
