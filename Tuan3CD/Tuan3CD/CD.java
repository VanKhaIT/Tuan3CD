package tuan3CD;

import java.text.DecimalFormat;

public class CD {
	private String maCD, tuaCD, caSy;
	private int soBH;
	private double giaThanh;
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(tuaCD != null) {
			this.tuaCD = tuaCD;
		}
		else
			System.out.println("Lỗi tua CD");
	}
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) throws Exception{
		if (maCD != null) {
			this.maCD = maCD;
		}
		else 
			throw new Exception("Loi ma CD");
	} 
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if (soBH >= 1) {
			this.soBH = soBH;
		}
		else 
			throw new Exception("Loi so bai hat");
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) throws Exception {
		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		}
		else {
			throw new Exception("Loi gia thanh");
		}
	}
	public String getCaSy() {
		return caSy;
	}
	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}
	
		
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(String maCD, String tuaCD, String caSy, int soBH, double giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.soBH = soBH;
		this.giaThanh = giaThanh;
	}
	@Override
	public String toString() {
			DecimalFormat fm = new DecimalFormat("###, 000");
			return String.format("%5s %5s %5s %15s %5s %15s %5s %10d %5s %15s %5s", "|", this.getMaCD(), "|", this.getTuaCD(), "|", this.getCaSy(), "|", this.getSoBH(), "|", fm.format(this.getGiaThanh()), "|");
	}
	
	
}
