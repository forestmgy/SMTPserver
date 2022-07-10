package test;

public class Test {



    public static void main(String[] args) {
        ClassroomTeacher c1 = new ClassroomTeacher("张三", "19791216", 'A', 10);
        ClassroomTeacher c2 = new ClassroomTeacher("李四", "19861015", 'C', 12);
        ClassroomTeacher c3 = new ClassroomTeacher("王一", "19900118", 'C', 8);
        ClassroomTeacher c4 = new ClassroomTeacher("张五", "19830115", 'C', 3);
        ClassroomTeacher c5 = new ClassroomTeacher("张丽", "19750214", 'A', 6);
        ClassroomTeacher c6 = new ClassroomTeacher("秦勤", "19781203", 'B', 8);
        ClassroomTeacher c7 = new ClassroomTeacher("王天", "19801116", 'C', 7);
        ClassroomTeacher c8 = new ClassroomTeacher("李丹", "19961013", 'D', 5);
        AdministrativeTeacher a1 = new AdministrativeTeacher("郑真", "19951012", 'C');
        AdministrativeTeacher a2 = new AdministrativeTeacher("李笑", "19970610", 'C');
        AdministrativeTeacher a3 = new AdministrativeTeacher("王望", "19900715", 'C');

        double totalNum = c1.calLessonSalary()+c2.calLessonSalary()+c3.calLessonSalary()+c4.calLessonSalary()+c5.calLessonSalary()+c6.calLessonSalary()+c7.calLessonSalary()+c8.calLessonSalary();
        int num = 8;
        System.out.println("姓名              十月份工资             十一月工资            十二月工资");
        System.out.println(c1.gettName()+"              "+c1.calSalary()+c1.getSalary(10)+"             "+c1.calSalary()+c1.getSalary(11)+"            "+c1.calSalary()+c1.getSalary(12));
        System.out.println(c2.gettName()+"              "+c2.calSalary()+c2.getSalary(10)+"             "+c2.calSalary()+c2.getSalary(11)+"            "+c2.calSalary()+c2.getSalary(12));
        System.out.println(c3.gettName()+"              "+c3.calSalary()+c3.getSalary(10)+"             "+c3.calSalary()+c3.getSalary(11)+"            "+c3.calSalary()+c3.getSalary(12));
        System.out.println(c4.gettName()+"              "+c4.calSalary()+c4.getSalary(10)+"             "+c4.calSalary()+c4.getSalary(11)+"            "+c4.calSalary()+c4.getSalary(12));
        System.out.println(c5.gettName()+"              "+c5.calSalary()+c5.getSalary(10)+"             "+c5.calSalary()+c5.getSalary(11)+"            "+c5.calSalary()+c5.getSalary(12));
        System.out.println(c6.gettName()+"              "+c6.calSalary()+c6.getSalary(10)+"             "+c6.calSalary()+c6.getSalary(11)+"            "+c6.calSalary()+c6.getSalary(12));
        System.out.println(c7.gettName()+"              "+c7.calSalary()+c7.getSalary(10)+"             "+c7.calSalary()+c7.getSalary(11)+"            "+c7.calSalary()+c7.getSalary(12));
        System.out.println(c8.gettName()+"              "+c8.calSalary()+c8.getSalary(10)+"             "+c8.calSalary()+c8.getSalary(11)+"            "+c8.calSalary()+c8.getSalary(12));
        System.out.println(a1.gettName()+"              "+a1.calSalary(totalNum,num)+a1.getSalary(10)+"             "+a1.calSalary(totalNum,num)+a1.getSalary(11)+"            "+a1.calSalary(totalNum,num)+a1.getSalary(12));
        System.out.println(a2.gettName()+"              "+a2.calSalary(totalNum,num)+a2.getSalary(10)+"             "+a2.calSalary(totalNum,num)+a2.getSalary(11)+"            "+a2.calSalary(totalNum,num)+a2.getSalary(12));
        System.out.println(a3.gettName()+"              "+a3.calSalary(totalNum,num)+a3.getSalary(10)+"             "+a3.calSalary(totalNum,num)+a3.getSalary(11)+"            "+a3.calSalary(totalNum,num)+a3.getSalary(12));





    }

}
