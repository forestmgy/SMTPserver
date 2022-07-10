package test;

public class Teacher {
        private   String tName;
        private String tBirth;//需要输入如 19960101这样的格式
        private double tSalary;//月薪
        private char tGrade;
        private double tBSalary;//基础月薪

        public Teacher(String tName, String tBirth,char tGrade) {
                this.tName = tName;
                this.tBirth = tBirth;
                this.tSalary = tSalary;
                this.tGrade = tGrade;
        }

        public double getBSalary() {
                double bsalary = 0.0;
                if (tGrade == 'A') {
                        bsalary = 7000;
                } else if (tGrade == 'B') {
                        bsalary = 6000;
                } else if (tGrade == 'C') {
                        bsalary = 5000;
                } else if (tGrade == 'D') {
                        bsalary = 4000;
                }
                return bsalary;
        }

        public double getSalary(int month) {
                String smon = tBirth.substring(4, 6);
                int inmon = Integer.parseInt(smon);
                double salary = 0;
                if (inmon == month) {
                        salary = 300;
                }
                return salary;
        }

        public String gettName() {
                return tName;
        }

        public void settName(String tName) {
                this.tName = tName;
        }

        public String gettBirth() {
                return tBirth;
        }

        public void settBirth(String tBirth) {
                this.tBirth = tBirth;
        }

        public char gettGrade() {
                return tGrade;
        }

        public void settGrade(char tGrade) {
                this.tGrade = tGrade;
        }
}
