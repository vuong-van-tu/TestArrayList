public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Student hs1 = new Student("phong",23);
        Student hs2 = new Student("như anh",33);
        Student hs3 = new Student("thanh",27);
        list.addStudent(hs1);
        list.addStudent(hs2);
        list.addStudent(hs3);
        list.display();
        int find = list.findStudent("aaa");
        if (find==-1){
            System.out.println("Không có học sinh ");
        }else {
            System.out.println("Học sinh cần tìm : ");
            System.out.println(list.studentList.get(find));
        }
        System.out.println("Học sinh sau khi xóa");
        list.deleteStudent("phong");
        list.display();
        System.out.println("Sửa thông tin");
        list.edit("thanh",new Student("phong ngu",36));
        list.display();
        list.sortByAge();
        list.display();

    }
}
