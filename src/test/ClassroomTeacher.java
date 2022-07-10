package test;

public class ClassroomTeacher extends Teacher{

     private int wLessonNum;


    public ClassroomTeacher(String tName, String tBirth,char tGrade,int wLessonNum) {
        super(tName, tBirth, tGrade);
        this.wLessonNum=wLessonNum;
    }
    public double calLessonSalary(){
        double LessonSalary=0.0;
        if (gettGrade() == 'A') {
            LessonSalary = (wLessonNum-4)*80;
        } else if (gettGrade()  == 'B') {
            LessonSalary = (wLessonNum-4)*60;
        } else if (gettGrade() == 'C') {
            LessonSalary = (wLessonNum-4)*45;
        } else if (gettGrade()  == 'D') {
            LessonSalary = (wLessonNum-4)*30;
        }
        return LessonSalary;
    }
    public double calSalary(){
        return getBSalary()+calLessonSalary();
    }
}
