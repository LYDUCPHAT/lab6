class Nhanvien{
    String ten;
    long luong;
    Nhanvien(String ten){
        this.ten = ten;
    }
    public String loainhanvien(){
        return this.ten;
    }
    public void tinhluong(){
        long luong = 30000L;
        System.out.println("Luong: "+luong);
    }
    public void xuatthongtin(){
        System.out.println("("+this.ten+")");
    }
}
class fulltime extends Nhanvien{
    int loaichucvu;
    int ngaylamviec;
    fulltime(String ten){
        super(ten);
    }
    fulltime(String ten, int ngaylamviec, int loaichucvu){
        super(ten);
        this.ngaylamviec = ngaylamviec;
        this.loaichucvu = loaichucvu;
    }
    public String loainhanvien(){
        return this.ten;
    }
    public void tinhluong(){
        int luong = 30000*this.ngaylamviec*8;
        System.out.println("Luong: "+luong);
    }
}
class parttime extends Nhanvien{
    int giolamviec;
    parttime(String ten){
        super(ten);
    }
    parttime(String ten, int giolamviec){
        super(ten);
        this.giolamviec = giolamviec;
    }
    
    public void tinhluong(){
        int luong = 30000*this.giolamviec;
        System.out.println("Luong: "+luong);
    }
}
class Main{
    public static void main(String[]args){
        Nhanvien a = new Nhanvien("Alex");
        fulltime b = new fulltime("John", 30, 1);
        parttime c = new parttime("Peter", 240);
        System.out.println("Nhan vien: "+a.loainhanvien());
        a.tinhluong();
        System.out.println("Nhan vien: "+b.loainhanvien());
        b.tinhluong();
        System.out.println("Nhan vien: "+c.loainhanvien());
        c.tinhluong();

    }
}