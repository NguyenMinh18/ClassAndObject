package advance.dev;

public class SinhVien {
	String name;
	int old;
	String address;
	String sdt;
	float dtb;
	
	
	public SinhVien(String name, int old, String address, String sdt, float dtb) {
		super();
		this.name = name;
		this.old = old;
		this.address = address;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	
}
