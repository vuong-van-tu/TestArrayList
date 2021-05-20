import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StudentList {
    ArrayList<Student> studentList = null;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    void addStudent(Student student){
        studentList.add(student);
    }
    int findStudent(String name){
        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getTen())){
                return i;
            }
        }
        return -1;
    }

    void deleteStudent(String name){
//        Student student = this.studentList.stream().filter(t->t.getTen().equals(name)).findFirst().orElse(null);
        int find = findStudent(name);
        if (find==-1){
            System.out.println("Không có học sinh để xóa !");
        }else {
            studentList.remove(find);
        }
    }
    void display(){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========================");
    }
    void edit(String name,Student student){
        studentList.set(findStudent(name),student);
    }
    public void sortByAge(){
        Collections.sort(this.studentList);
    }
}
