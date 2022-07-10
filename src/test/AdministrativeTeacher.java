package test;

public class AdministrativeTeacher extends Teacher{

    public AdministrativeTeacher(String tName, String tBirth, char tGrade) {
        super(tName, tBirth, tGrade);
    }
    public double getJX(double totalNum,int num){//总经费和总人数
        return totalNum/num;
    }
    public double calSalary(double totalNum,int num){
        return getJX(totalNum, num)+getBSalary();
    }

}
