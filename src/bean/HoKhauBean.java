package bean;

public class HoKhauBean {
	public int hoKhauId;
	public String tinh_TP;
	public String quan_Huyen;
	public String phuong_Xa;
	public String to_Thong;
	public int chuHoId;
	public HoKhauBean(int hoKhauId, String tinh_TP, String quan_Huyen, String phuong_Xa, String to_Thong, int chuHoId) {
		super();
		this.hoKhauId = hoKhauId;
		this.tinh_TP = tinh_TP;
		this.quan_Huyen = quan_Huyen;
		this.phuong_Xa = phuong_Xa;
		this.to_Thong = to_Thong;
		this.chuHoId = chuHoId;
	}
	public int getHoKhauId() {
		return hoKhauId;
	}
	public void setHoKhauId(int hoKhauId) {
		this.hoKhauId = hoKhauId;
	}
	public String getTinh_TP() {
		return tinh_TP;
	}
	public void setTinh_TP(String tinh_TP) {
		this.tinh_TP = tinh_TP;
	}
	public String getQuan_Huyen() {
		return quan_Huyen;
	}
	public void setQuan_Huyen(String quan_Huyen) {
		this.quan_Huyen = quan_Huyen;
	}
	public String getPhuong_Xa() {
		return phuong_Xa;
	}
	public void setPhuong_Xa(String phuong_Xa) {
		this.phuong_Xa = phuong_Xa;
	}
	public String getTo_Thong() {
		return to_Thong;
	}
	public void setTo_Thong(String to_Thong) {
		this.to_Thong = to_Thong;
	}
	public int getChuHoId() {
		return chuHoId;
	}
	public void setChuHoId(int chuHoId) {
		this.chuHoId = chuHoId;
	}
	
	
}
