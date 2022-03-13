package tuan3CD;
import java.util.Scanner;

public class testCD {
	static Scanner sc = new Scanner(System.in);
	
	public static void menuCD(ListCD ls) throws Exception {
		int chon = 0;
		do {
			System.out.println("\n\n===============MENU==============\n");
			System.out.println("\t1. Nhập cứng");
			System.out.println("\t2. Thêm CD");
			System.out.println("\t3. Sửa CD");
			System.out.println("\t4. Xóa 1 CD");
			System.out.println("\t5. Xuất dannh sách CD");
			System.out.println("\t6. Sắp xếp.");
			System.out.println("\t7. Thoát!\n");
			System.out.println("==================================");
			System.out.println("Chọn chức năng:");
			chon = sc.nextInt();
			if(chon < 1 || chon > 7) {
				System.out.println("Vui lòng chọn số từ 1 đến 7: ");
			}
			else {
				switch(chon) {
				case 1:
					nhapCung(ls);
					break;
				case 2:
					themCD(ls);
					break;
				case 3:
					suaCD(ls);
					break;
				case 4:
					xoaCD(ls);
					break;
				case 5:
					xuatList(ls.getListCD(), ls.count);
					break;
				case 6:
					ls.sapXep();
					break;
				}	
			}
		}while(chon != 7);
	}
	public static void main(String[] args)  throws Exception{
		ListCD ls = new ListCD(5);
		menuCD(ls);
		
	}
	static void nhapCung(ListCD ls) throws Exception {
		CD cd1 = new CD("3", "Tình Khúc Vàng", "Đan Trường", 2, 500000);
		ls.themCD(cd1);
		CD cd2 = new CD("1", "Lối Nhỏ", "Đen Vâu", 5, 4000000);
		ls.themCD(cd2);
		CD cd3 = new CD("2", "Gieo Quẻ", "Hoàng Thùy Linh", 4, 200000);
		ls.themCD(cd3);
		CD cd4 = new CD("4", "Người Âm Phủ", "Osad", 1, 8000000);
		ls.themCD(cd4);
	}
	public static void xuatList(CD[] ls,int count) {
		System.out.println("\n\t\tDANH SÁCH CD");
		System.out.printf("\n%5s-----------------------------------------------------------------------------------------------\n", "-");
		System.out.printf("%5s %5s %5s %15s %5s %15s %5s %10s %5s %15s %5s", "|", "Mã CD", "|", "Tua CD", "|", "Ca Sỹ", "|", "Số bài hát", "|", "Giá Thành", "|");
		System.out.printf("\n%5s-----------------------------------------------------------------------------------------------\n", "-");
		if(count > 0) {
			for(int i = 0 ; i< count ; i++) {
				System.out.println(ls[i]);
				System.out.printf("%5s-----------------------------------------------------------------------------------------------\n", "-");
			}
		}else {
			System.out.println("\t\t\tDanh sách rỗng ");
		}
	}
	public static void themCD(ListCD ls) throws Exception {
		
			System.out.println("Nhập mã CD: ");
			String ma = sc.next();
			sc.nextLine();
			System.out.println("Nhập tựa CD:");
			String tua = sc.nextLine();

			System.out.println("Nhập tên ca sỹ:");		
			String ten = sc.nextLine();	
		
			System.out.println("Nhập số bài hát:");
			int so = sc.nextInt();

			System.out.println("Nhập giá thành: ");
			Double gia = sc.nextDouble();
			
			CD cd = new CD(ma, tua, ten, so, gia); 
			
			ls.themCD(cd);
	}
	
	public static void suaCD(ListCD ls) throws Exception {
		CD cd = new CD(); 
		System.out.println("Nhập mã CD muốn sửa: ");
		cd.setMaCD(sc.next());
		
			System.out.println("Nhập tựa CD: ");
			cd.setTuaCD(sc.nextLine());
			
			System.out.println("Nhập tên Ca Sĩ: ");
			cd.setCaSy(sc.nextLine());
			
			System.out.println("Nhập số bài hát: ");
			cd.setSoBH(sc.nextInt());
			
			System.out.println("Nhập Giá Thành: ");
			cd.setGiaThanh(sc.nextDouble());
			
			ls.suaCD(cd);
		
	}
	
	public static void xoaCD(ListCD ls) throws Exception{
		CD cd = new CD(); 
		System.out.println("Nhập mã CD muốn xóa: ");
		cd.setMaCD(sc.next());
		ls.xoaCD(cd);
	}
}
