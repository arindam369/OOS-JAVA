class Student {
    String name;
    int roll;
    String subjects[];

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.subjects = new String[5];
        subjects[0] = "Maths";
        subjects[1] = "CN";
        subjects[2] = "OOS";
        subjects[3] = "Graph";
        subjects[4] = "Graphics";
    }

    public String[] getSubjects() {
        return subjects;
    }
}

class TabulationSheet {
    int roll;
    int marks[];

    TabulationSheet() {
        this.marks = new int[5];
    }
    void addData(int roll, int  marksArray[]){
        this.roll = roll;
        this.marks = marksArray;
    }
}

class MarkSheet {
    String name;
    int marks[];
    String subjects[];

    MarkSheet(Student stud) {
        this.marks = new int[5];
        this.subjects = stud.getSubjects();
    }
    void addData(String name, int marksArray[]){
        this.name = name;
        this.marks = marksArray;
    }
    void printMarks() {
        System.out.println("Student Name : " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + "  -->  " + marks[i]);
        }
        System.out.println("");
    }
}

class ten {
    public static void main(String[] args) {
        Student s1 = new Student("Arindam", 36);
        Student s2 = new Student("Rajdeep", 50);
        Student s3 = new Student("Sanghita", 64);

        TabulationSheet ts1 = new TabulationSheet();
        TabulationSheet ts2 = new TabulationSheet();
        TabulationSheet ts3 = new TabulationSheet();
        TabulationSheet ts4 = new TabulationSheet();
        TabulationSheet ts5 = new TabulationSheet();
        ts1.addData(1, new int[]{90,91,92,93,94});
        ts2.addData(2, new int[]{100,99,98,97,96});
        ts3.addData(3, new int[]{99,98,95,96,100});
        ts4.addData(4, new int[]{96,98,99,92,90});
        ts5.addData(5, new int[]{90,85,90,95,93});

        MarkSheet ms1 = new MarkSheet(s1);
        MarkSheet ms2 = new MarkSheet(s2);
        MarkSheet ms3 = new MarkSheet(s3);
        ms1.addData("Arindam", new int[]{90, 80, 90, 90, 95});
        ms2.addData("Rajdeep", new int[]{99, 96, 94, 98, 96});
        ms3.addData("Sanghita", new int[]{100, 94, 96, 98, 90});

        ms1.printMarks();
        ms2.printMarks();
        ms3.printMarks();
    }
}