
import javax.print.attribute.IntegerSyntax;

public class Student {
    String name;
    String ID;
    double CGPA;

    public static class SortUsing extends IntegerSyntax {
        protected SortUsing(int value) {
            super(value);
        }
        static SortUsing CGPA = new SortUsing(0);
        static SortUsing Name = new SortUsing(1);
        static SortUsing ID = new SortUsing(2);
    }

    public Student(String name, String ID, double CGPA) {
        this.name = name;
        this.ID = ID;
        this.CGPA = CGPA;
    }

    public static Student[] sort(Student[] unsorted, int order, SortUsing sortUsing) {
        boolean sorted = false;
        while (!sorted) {
            for (int i = 1; i < unsorted.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (sortUsing.getValue() == Student.SortUsing.CGPA.getValue())
                    {
                        if (order > 0 ? unsorted[j].CGPA > unsorted[i].CGPA : unsorted[j].CGPA < unsorted[i].CGPA ) {
                            Student temp = unsorted[j];
                            unsorted[j] = unsorted[i];
                            unsorted[i] = temp;
                        } else if (j == i-1 && i == unsorted.length - 1){
                            sorted = true;
                        }
                    } else if (sortUsing.getValue() == Student.SortUsing.Name.getValue()){
                        if (order > 0 ? unsorted[j].name.compareTo(unsorted[i].name) > 0 : unsorted[j].name.compareTo(unsorted[i].name) < 0) {
                            Student temp = unsorted[j];
                            unsorted[j] = unsorted[i];
                            unsorted[i] = temp;
                        } else if (j == i-1 && i == unsorted.length - 1){
                            sorted = true;
                        }
                    } else if (sortUsing.getValue() == Student.SortUsing.ID.getValue()){
                        if (order > 0 ? unsorted[j].ID.compareTo(unsorted[i].ID) > 0 : unsorted[j].ID.compareTo(unsorted[i].ID) < 0) {
                            Student temp = unsorted[j];
                            unsorted[j] = unsorted[i];
                            unsorted[i] = temp;
                        } else if (j == i-1 && i == unsorted.length - 1){
                            sorted = true;
                        }
                    }
                }
            }
        }
        return unsorted;
    }
}
