package demoThucHanh;

public class sinhVien {
    private int rollNo;
    private String name;
    private String address;
    private float mark;

    public sinhVien()
    {}

    /**
     *
     * @param rollNo
     * @param name
     */

    public sinhVien(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     *
     * @param rollNo
     * @param name
     * @param address
     */

    public sinhVien(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @param rollNo
     * @param name
     * @param address
     * @param mark
     */

    public sinhVien(int rollNo, String name, String address, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    /**
     *
     * @param rollNo
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }

    public static void main(String[] args) {
        sinhVien sv = new sinhVien(123,"Hưởng");
        System.out.println(sv.toString());    }
}
