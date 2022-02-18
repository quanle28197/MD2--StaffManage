public class Methods {
    public static NhanVien addPartTime(String codeNV, String Name, int Phone, String Email, int Time) {
        return new NhanVienPartTime(codeNV, Name, Phone, Email, Time);
    }

    public static NhanVien addFullTime(String codeNV, String Name, int Phone, String Email, int Bonus, int Fine, int Salary) {
        return new NhanVienFullTime(codeNV, Name,Phone, Email, Bonus, Fine, Salary);
    }

    public static NhanVien[] addNhanVien(NhanVien[] newNhanVien, NhanVien[] nhanVien) {
        for (int i = 0; i < newNhanVien.length; i++) {
            if (i < newNhanVien.length - 1) {
                newNhanVien[i] = nhanVien[i];
            }
        }
        return newNhanVien;
    }
    public static int getAverageSalary(NhanVien[] newNhanVien) {
        int sumSalaryPartTime = 0;
        int sumSalaryFullTime = 0;
        for (int i = 0; i < newNhanVien.length; i++) {
            if (newNhanVien[i] instanceof NhanVienPartTime) {
                sumSalaryPartTime += ((NhanVienPartTime) newNhanVien[i]).getLuongPartTime();
            } else if (newNhanVien[i] instanceof NhanVienFullTime) {
                sumSalaryFullTime += ((NhanVienFullTime) newNhanVien[i]).luongFullTime();
            }
        }
        int AverageSalary = (sumSalaryFullTime + sumSalaryPartTime) / newNhanVien.length;
        return AverageSalary;
    }

    public static String listLessThanAvarageSalary(NhanVien[] newNhanVien) {
        String List = "";
        for (int i = 0; i < newNhanVien.length; i++) {
            if (newNhanVien[i] instanceof NhanVienFullTime) {
                if (((NhanVienFullTime) newNhanVien[i]).luongFullTime() < getAverageSalary(newNhanVien)) {
                    List += ((NhanVienFullTime) newNhanVien[i]).toString();
                    System.out.println(newNhanVien);
                }
            }
        }
        return List;
    }

    public static int sumSalaryPartTime(NhanVien[] newNhanVien) {
        int sumSalaryPartTime = 0;
        for (int i = 0; i < newNhanVien.length ; i++) {
            if (newNhanVien[i] instanceof NhanVienPartTime) {
                sumSalaryPartTime += ((NhanVienPartTime) newNhanVien[i]).getLuongPartTime();
            }
        }
        return sumSalaryPartTime;
    }

    public static NhanVien[] sortNvBySalary(NhanVien[] nhanVien) {
        for (int i = 0; i < nhanVien.length; i++) {
            for (int j = 1; j < nhanVien.length - i; j++) {
                if(nhanVien[j] instanceof NhanVienFullTime){
                    if(((NhanVienFullTime) nhanVien[j-1]).luongFullTime()>((NhanVienFullTime) nhanVien[j]).luongFullTime()){
                        NhanVienFullTime temp = (NhanVienFullTime) nhanVien[j-1];
                        nhanVien[j-1]= (NhanVienFullTime) nhanVien[j];
                        nhanVien[j] = temp;
                    }
                }
            }
        }
        return nhanVien;
    }
    public static String arrayNvSort(NhanVien[] nhanVien) {
        String List = "";
        for (int i = 0; i < nhanVien.length; i++) {
            List += nhanVien[i].toString();
        }
        return List;
    }
}
