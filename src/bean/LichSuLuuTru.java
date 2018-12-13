package bean;

import java.sql.Date;

public class LichSuLuuTru {
	public int cmndID;
	public int hoKhauID;
	public int loaiLuuTruId;
	public Date thoiGianBatDauLT;
	public Date thoiGianKetThucLT;
	public String quanHeVoiChuHo;
	public LichSuLuuTru(int cmndID, int hoKhauID, int loaiLuuTruId, Date thoiGianBatDauLT, Date thoiGianKetThucLT,
			String quanHeVoiChuHo) {
		super();
		this.cmndID = cmndID;
		this.hoKhauID = hoKhauID;
		this.loaiLuuTruId = loaiLuuTruId;
		this.thoiGianBatDauLT = thoiGianBatDauLT;
		this.thoiGianKetThucLT = thoiGianKetThucLT;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}
	public int getCmndID() {
		return cmndID;
	}
	public void setCmndID(int cmndID) {
		this.cmndID = cmndID;
	}
	public int getHoKhauID() {
		return hoKhauID;
	}
	public void setHoKhauID(int hoKhauID) {
		this.hoKhauID = hoKhauID;
	}
	public int getLoaiLuuTruId() {
		return loaiLuuTruId;
	}
	public void setLoaiLuuTruId(int loaiLuuTruId) {
		this.loaiLuuTruId = loaiLuuTruId;
	}
	public Date getThoiGianBatDauLT() {
		return thoiGianBatDauLT;
	}
	public void setThoiGianBatDauLT(Date thoiGianBatDauLT) {
		this.thoiGianBatDauLT = thoiGianBatDauLT;
	}
	public Date getThoiGianKetThucLT() {
		return thoiGianKetThucLT;
	}
	public void setThoiGianKetThucLT(Date thoiGianKetThucLT) {
		this.thoiGianKetThucLT = thoiGianKetThucLT;
	}
	public String getQuanHeVoiChuHo() {
		return quanHeVoiChuHo;
	}
	public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}
	
	
	
	
}
