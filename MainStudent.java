
public class MainStudent {
    public static void main(String[] args){
        Student students[] = new Student[6];
        students[0] = new Student("Manas", "2021B4AA1908H", 7.37);
        students[1] = new Student("SHAANTy", "2021B3A82232H", 7.61);
        students[2] = new Student("RAHUL", "2020xxpp1092H", 7.27);
        students[3] = new Student("Dreamer", "2019aaoo1220H", 4.37);
        students[4] = new Student("Manas", "2021B4AA1908H", 3.37);
        students[5] = new Student("Manas", "2021B4AA1908H", 10.00);
        System.out.println("ID\t\t\t\tName\t\tCGPA");
        Student.sort(students, 1, Student.SortUsing.ID);
        for (Student student : students) {
            System.out.printf("%s\t%s\t\t%.2f\n", student.ID, student.name, student.CGPA);
        }
    }
}
