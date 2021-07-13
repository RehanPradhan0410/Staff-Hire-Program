/**
 * The class creates a vacancy for hiring part-time and full-time staff
 *
 * @author (Rehan Pradhan)
 * @version (0.1)
 */




public class StaffHire
{
    //declaring global variables//
    private int vacancyNo;
    private String designation;
    private String jobType;
    //creating constructor to make an object//
    public StaffHire(int vacancyNo, String designation,String jobType)
    {
        this.vacancyNo=vacancyNo;
        this.designation=designation;
        this.jobType=jobType;
    }
    //creating accessor method for each method (getter and setter method)//)
    public int getvacancyNo()
    {
        return vacancyNo;
    }
    public void setvacancyNo(int vacancyNo)
    {
        
        this.vacancyNo=vacancyNo;
    }
    public String getdesignation()
    {
        return designation;
    }
    public void setdesignation(String designation)
    {
        this.designation=designation;
    }
    public String getjobType()
    {
        return jobType;
    }
    public void setjobType(String jobType)
    {
        this.jobType=jobType;
    }
    //This method displays all the details in StaffHire//
    public void display()
    {
        System.out.println("---------------------------------");
        System.out.println("Vacancy number="+getvacancyNo());
        System.out.println("Designation="+getdesignation());
        System.out.println("Job-Type="+getjobType());
        System.out.println("---------------------------------");
    }
}
//class closed//
