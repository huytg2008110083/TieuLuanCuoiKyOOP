package KiemTraCuoiKy;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DanhSachHangHoa dSHangHoa = new DanhSachHangHoa();
        Date date = new Date();
        int chon;int temp;String tim;
        QuanLyHangHoa ThucPham1 = new ThucPham("001", "ca moi 3 co gai", 200, 10000, date, date, "Royal Foods");
        QuanLyHangHoa ThucPham2 = new ThucPham("002", " ca(fish)", 100, 20000,date, date, "Binh Duong");
        QuanLyHangHoa ThucPham3 = new ThucPham("003", "Choco-Pie", 500, 40000,date, date, "Orion Han Quoc");
        QuanLyHangHoa ThucPham4 = new ThucPham("004", "thit(meat)", 1000, 3000,date, date, "co so che bien thit ca TAM ANH"); 
        QuanLyHangHoa SanhSu1 = new SanhSu("011", "bat ", 100, 10000, "bat trang", date);
        QuanLyHangHoa SanhSu2 = new SanhSu("012", "Binh hoa", 200, 20000, "bat trang", date);
        QuanLyHangHoa SanhSu3 = new SanhSu("013", "dia ", 50, 10000, "bat trang", date);
        QuanLyHangHoa DienMay1 = new DienMay("021", "laptop", 3, 15000000, 12, 210);
        QuanLyHangHoa DienMay2 = new DienMay("022", "Tivi GL", 7, 13000000, 24, 240);
        QuanLyHangHoa DienMay3 = new DienMay("023", "May giat", 4, 8000000, 24, 200);
        do {
            System.out.println("----------------MENU------------");
            System.out.println("||1.Them hang hoa             || ");
            System.out.println("||2.Xoa hang hoa              ||");
            System.out.println("||3.Sua hang hoa              ||");
            System.out.println("||4.in xuat hang hoa co san   ||");
            System.out.println("||5.Tim kiem hang hoa theo ma ||");
            System.out.println("||6.Thoat                     ||");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                do {
                    System.out.println("-------MENU-THEM--------");
                    System.out.println("||1.Them hang thuc pham||");
                    System.out.println("||2.Them hang sanh su  ||");
                    System.out.println("||3.Them hang dien may ||");
                    System.out.println("||4.Thoat              ||");
                    System.out.print("Nhap lua chon: ");
                    temp = scanner.nextInt();
                    switch (temp) {
                        case 1:
                            dSHangHoa.NhapHangHoa(1);
                            break;
                        case 2:
                            dSHangHoa.NhapHangHoa(2);
                            break;
                        case 3:
                            dSHangHoa.NhapHangHoa(3);
                            break;
                    }
                } while (temp != 0);
                ;
                    break;
                case 2:
                System.out.println("Nhap ma hang hoa can xoa: ");
                scanner.nextLine();
                tim = scanner.nextLine();
                System.out.println("Hang hoa can xoa !!!");
                dSHangHoa.xoaHangHoa(dSHangHoa.timHangHoaTheoMa(tim));
                System.out.println("Danh sach hang hoa sau khi xoa !!!");

                dSHangHoa.inDSHangHoa();
                    break;
                case 3:
                dSHangHoa.TimHangHoaTheoViTri(SanhSu1);
                dSHangHoa.suaHangHoa(4,SanhSu1);
                    break;
                case 4:
                dSHangHoa.them(ThucPham1);
                dSHangHoa.them(ThucPham2);
                dSHangHoa.them(ThucPham3);
                dSHangHoa.them(ThucPham4);
                dSHangHoa.them(SanhSu1);
                dSHangHoa.them(SanhSu2);
                dSHangHoa.them(SanhSu3);
                dSHangHoa.them(DienMay1);
                dSHangHoa.them(DienMay2);
                dSHangHoa.them(DienMay3);
                dSHangHoa.inDSHangHoa();
                    break;
                case 5:
                System.out.println("Nhap ma hang hoa can tim: ");
                    scanner.nextLine();
                    tim = scanner.nextLine();
                    dSHangHoa.timHangHoaTheoMa(tim);
                    break;
            }
        } while (chon != 0);
    }

}
