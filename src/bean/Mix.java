package bean;

public class Mix {
	public CongDanBean congDan;
	public HoKhauBean hoKhau;
	public LichSuLuuTru lichSuLT;
	public LoaiLuuTruBean loaiLT;
	public Mix(CongDanBean congDan, HoKhauBean hoKhau, LichSuLuuTru lichSuLT, LoaiLuuTruBean loaiLT) {
		super();
		this.congDan = congDan;
		this.hoKhau = hoKhau;
		this.lichSuLT = lichSuLT;
		this.loaiLT = loaiLT;
	}
	public CongDanBean getCongDan() {
		return congDan;
	}
	public void setCongDan(CongDanBean congDan) {
		this.congDan = congDan;
	}
	public HoKhauBean getHoKhau() {
		return hoKhau;
	}
	public void setHoKhau(HoKhauBean hoKhau) {
		this.hoKhau = hoKhau;
	}
	public LichSuLuuTru getLichSuLT() {
		return lichSuLT;
	}
	public void setLichSuLT(LichSuLuuTru lichSuLT) {
		this.lichSuLT = lichSuLT;
	}
	public LoaiLuuTruBean getLoaiLT() {
		return loaiLT;
	}
	public void setLoaiLT(LoaiLuuTruBean loaiLT) {
		this.loaiLT = loaiLT;
	}
	
	
}
