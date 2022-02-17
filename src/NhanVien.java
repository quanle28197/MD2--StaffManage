public class NhanVien {
    private String codeNV;
    private String Name;
    private int Phone;
    private String Email;

    public NhanVien() {

    }

    public NhanVien(String codeNV, String name, int phone, String email) {
        this.codeNV = codeNV;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getCodeNV() {
        return codeNV;
    }

    public void setCodeNV(String codeNV) {
        this.codeNV = codeNV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "codeNV ='" + codeNV + '\'' +
                ", Name ='" + Name + '\'' +
                ", Phone ='" + Phone + '\'' +
                ", Email ='" + Email + '\'' +
                '}';
     }

}
