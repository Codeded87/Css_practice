class Subject{
    private String subjectCode;
    private String subjectName;
    private int subjectCredit;
    private int subjectMaxMark;


    public void setSubjectCode(String code){this.subjectCode=code;}
    public void setSubjectName(String name){this.subjectName=name;}
    public void setSubjectCredit(int cre){this.subjectCredit=cre;}
    public void setSubjectMaxMark(int mak){this.subjectMaxMark=mak;}


    
    public String getSubjectCode(){return this.subjectCode;}
    public String getSubjectName(){return this.subjectName;}
    public int  getSubjectCredit(){return this.subjectCredit;}
    public int getSubjectMaxMark(){return this.subjectMaxMark;}
}