import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        NhanVien[] nhanVien = new NhanVien[5];
        NhanVien[] newNhanVien = new NhanVien[nhanVien.length + 1];
        nhanVien[0] = new NhanVienFullTime("C1122", "HẢI", 023232323, "SSS.COM", 343, 32, 3232323);
        nhanVien[1] = new NhanVienFullTime("C1111", "TUẤN", 02323452, "ZZZ.COM", 200, 22, 2323232);
        nhanVien[2] = new NhanVienFullTime("C2222", "Phương", 023232232, "XXX.COM", 323, 35, 2323231);
        nhanVien[3] = new NhanVienPartTime("C3333", "Mai", 223232323, "phimmoi.com", 50);
        nhanVien[4] = new NhanVienPartTime("C4444", "KIN", 42343434, "ABC.COM", 232);
        System.out.println(Methods.ArrayNvSort(Methods.SortNvBySalary(nhanVien)));
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Add more employees");
            System.out.println("1. Add Part-time employee");
            System.out.println("2. Add Full-Time employee");
            System.out.println("3. Average Full-Time salary ");
            System.out.println("4. Part-Time Salary");
            System.out.println("5. Sort Full-Time salary ");
            System.out.println("0. Exit");

            int numbers = scanner.nextInt();
            scanner.nextLine();
            switch (numbers) {
                case 1:
                    System.out.println("Enter code for new staff:");
                    String codeNV = scanner.nextLine();
                    System.out.println("Enter name of new staff");
                    String Name = scanner.nextLine();
                    System.out.println("Enter phone number of new staff");
                    int Phone = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter email of new staff");
                    String Email = scanner.nextLine();
                    System.out.println("Enter the realtime");
                    int Time = scanner.nextInt();
                    Methods.addNhanVien(newNhanVien, nhanVien);
                    newNhanVien[newNhanVien.length - 1] = Methods.AddPartTime(codeNV, Name, Phone, Email, Time);
                    break;
                case 2:
                    System.out.println("Enter code for new staff:");
                    String codeNV1 = scanner.nextLine();
                    System.out.println("Enter name of new staff");
                    String Name1 = scanner.nextLine();
                    System.out.println("Enter phone number of new staff");
                    int Phone1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter email of new staff");
                    String Email1 = scanner.nextLine();
                    System.out.println("Enter the bonus: ");
                    int Bonus = scanner.nextInt();
                    System.out.println("Enter the fine: ");
                    int Fine = scanner.nextInt();
                    System.out.println("Enter the salary:");
                    int Salary = scanner.nextInt();
                    Methods.addNhanVien(newNhanVien, nhanVien);
                    newNhanVien[newNhanVien.length - 1] = Methods.AddFullTime(codeNV1, Name1, Phone1, Email1, Bonus, Fine, Salary);
                    break;
                case 3:
                    System.out.println("List of full-time employees whose salary is lower than the average salary of" + Methods.ListLessThanAvarageSalary(newNhanVien));
                    break;
                case 4:
                    System.out.println("Salary for Part-Time employees:" + Methods.sumSalaryPartTime(newNhanVien));
                    break;
                case 5:
                    System.out.println("Sort Full-Time salary:" + Methods.ArrayNvSort(Methods.SortNvBySalary(nhanVien)));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
