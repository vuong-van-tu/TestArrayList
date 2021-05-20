public class Student implements Comparable<Student> {
    private String ten;
    private int tuoi;
    public Student(){
    }

    public Student(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getTuoi()-o.getTuoi();
    }
}
