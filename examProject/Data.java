public class Data{
    public static void main(String args[]){
        Student s1 = new Student();
    s1.setRoll(111);
    s1.setName("shiv");
    System.out.println("roll"+s1.getRoll());
    System.out.println("roll"+s1.getName());

    Department d1 = new Department();
    d1.setSemesterNumber(5);

    d1.setQualification("under Graduate");
    d1.setDepartment("EE");
    d1.setExamManner("end");
    d1.setExamMonth("NOv");
    d1.setExamYear(2000);

    System.out.println("semester number"+d1.getSemesterNumber());
    System.out.println("qualification"+d1.getQualification());
    System.out.println("department"+d1.getdepartment());
    System.out.println("Manner"+d1.getExamManner());
    System.out.println("Month"+d1.getExamMonth());
    System.out.println("Year"+d1.getExamYear());
    
    
    Subject sub = new Subject();
    sub.setSubjectCode("MM");
    sub.setSubjectName("math");
    sub.setSubjectCredit(4);
    sub.setSubjectMaxMark(100);
    System.out.println("code"+sub.getSubjectCode());
    System.out.println("Name"+sub.getSubjectName());
    System.out.println("credit"+sub.getSubjectCredit());
    System.out.println("Maxmarks"+sub.getSubjectMaxMark());
    

    }}