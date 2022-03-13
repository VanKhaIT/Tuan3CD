package tuan3CD;

public class ListCD {
	public CD[] ls;
	public int count;
	
	public ListCD(int n) {
		ls = new CD[n];
		count = 0;
	}
	public void tangKichThuocMang() {
		CD tempCD[] = new CD[ls.length * 2];
		for (int i = 0; i < ls.length; i++) {
			tempCD[i] = ls[i];
		}
		ls = tempCD;
	}
	public void themCD(CD cdThem) throws Exception{
		if (timKiem(cdThem) == -1)
		{
			if (count == ls.length)
				tangKichThuocMang();
			ls[count] = cdThem;
			System.out.println("\nThêm CD thành công!");
			count++;
		}
		else 
			throw new Exception("\nThêm CD thất bại (Trùng mã) !");
	}
	
	public void suaCD(CD cd) throws Exception{
		if(timKiem(cd) != -1) {
			ls[this.timKiem(cd)] = cd;
			System.out.println("\n Sửa CD thành công!");
		}
		else 
			System.out.println("\nSửa thất bại (không tìm thấy mã)!");
	}
	
	public void xoaCD(CD cd) throws Exception{
		if(timKiem(cd) != -1) {
			for(int i = this.timKiem(cd); i < ls.length - 1; i++) {
				ls[i] = ls[i+1];
			}
			System.out.println("\n\tXóa CD thành công!");
			count--;
		}
		else
			System.out.println("\nXóa thất bại (không tìm thấy mã)!");
	}
	
	public int timKiem(CD cd) {
		for (int i = 0; i < count; i++) {
			if (cd.getMaCD().compareTo(ls[i].getMaCD()) == 0)
				return i;
		}
		return -1;
	}
		
	public void sapXep() {
		for(int i = 0; i < count; i ++) {
			for(int j = i + 1; j < count; j++) {
				if(ls[i].getMaCD().compareTo(ls[j].getMaCD()) > 0) {
					CD tam = ls[i];
					ls[i] = ls[j];
					ls[j] = tam;
				}
			}
		}
		System.out.println("Sắp xếp theo mã tăng dần thành công!");
	}
	
	
	public CD[] getListCD() {
		return ls;
	}
	
}
