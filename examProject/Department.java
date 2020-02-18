class Department{
    int semesterNumber;
    String Qualification;
    String department;
    String ExamManner;
    String ExamMonth;
    long ExamYear;

    public void setSemesterNumber(int semNum ){this.semesterNumber=semNum;}
    public void setQualification(String quo){this.Qualification=quo;}
    public void setDepartment(String dep){this.department=dep;}
    public void setExamManner(String emanner){this.ExamManner=emanner;}
    public void setExamMonth(String eMonth){this.ExamMonth=eMonth;}
    public void setExamYear(long EYear){this.ExamYear=EYear;}

    public int getSemesterNumber(){return this.semesterNumber;}
    public String getQualification(){return this.Qualification;}
    public String getdepartment(){return this.department;}
    public String getExamManner(){return this.ExamManner;}
    public String getExamMonth(){return this.ExamMonth;}
    public long   getExamYear(){return this.ExamYear;} 
}