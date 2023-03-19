class hs{
    String hoten;
    String lop;
    int toan;
    int ly;
    int hoa;
    hs(String hoten, String lop, int toan, int ly, int hoa){
        this.hoten = hoten;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void diemtrungbinh(){
        double diem = (double)(this.toan+this.ly+this.hoa)/3;
        System.out.println("Diem trung binh: "+diem);
    }
}
class hschuyentoan extends hs{
    hschuyentoan(String hoten, String lop, int toan, int ly, int hoa){
        super(hoten, lop, toan, ly, hoa);
    }
    public void diemtrungbinh(){
        double diem = (double)((this.toan*2)+this.ly+this.hoa)/4;
        System.out.println("Diem trung binh chuyen toan: "+diem);
    }
}
class diem{
    public static void main(String[]args){
        hs a = new hs("John", "10-ĐH", 9, 8, 8);
        hschuyentoan b = new hschuyentoan("Alex", "10-ĐH", 9, 8, 8);
        a.diemtrungbinh();
        b.diemtrungbinh();
    }
}