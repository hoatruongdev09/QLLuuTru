package bean;

public class LoaiLuuTruBean {
	public int loaiLuuTruID;
	public String tenLoaiLuuTru;
	public LoaiLuuTruBean(int loaiLuuTruID, String tenLoaiLuuTru) {
		super();
		this.loaiLuuTruID = loaiLuuTruID;
		this.tenLoaiLuuTru = tenLoaiLuuTru;
	}
	public int getLoaiLuuTruID() {
		return loaiLuuTruID;
	}
	public void setLoaiLuuTruID(int loaiLuuTruID) {
		this.loaiLuuTruID = loaiLuuTruID;
	}
	public String getTenLoaiLuuTru() {
		return tenLoaiLuuTru;
	}
	public void setTenLoaiLuuTru(String tenLoaiLuuTru) {
		this.tenLoaiLuuTru = tenLoaiLuuTru;
	}
	
	
}
