package bean;

import java.sql.Date;

public class CongDanBean {
	public int cmndID;
	public String ten;
	public String ho;
	public Date ngaySinh;
	public String noiSinh;
	public String ttHonNhan;
	public String ngheNghiep;
	public CongDanBean(int cmndID, String ten, String ho, Date ngaySinh, String noiSinh, String ttHonNhan,
			String ngheNghiep) {
		super();
		this.cmndID = cmndID;
		this.ten = ten;
		this.ho = ho;
		this.ngaySinh = ngaySinh;
		this.noiSinh = noiSinh;
		this.ttHonNhan = ttHonNhan;
		this.ngheNghiep = ngheNghiep;
	}
	public int getCmndID() {
		return cmndID;
	}
	public void setCmndID(int cmndID) {
		this.cmndID = cmndID;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	public String getTtHonNhan() {
		return ttHonNhan;
	}
	public void setTtHonNhan(String ttHonNhan) {
		this.ttHonNhan = ttHonNhan;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	
	
}
