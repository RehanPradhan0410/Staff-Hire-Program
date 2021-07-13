/**
 * The class creates a vacancy and hires full-time staff
 *
 * @author (Rehan Pradhan)
 * @version (0.1)
 */


public class FullTimeStaffHire extends StaffHire
//The class FullTimeStaffHire is a child class of StaffHire//
{
    //declaring instance variables//
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined=false;
    public FullTimeStaffHire(int vacancyNo,String designation, String jobType,int salary,int workingHour)
    //creating a constructor to make an object and accept the data for variables in full-time staff//
    {
        super(vacancyNo,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    //creating getter methods which will return the values//
    public int getsalary()
    {
        return salary;
    }
    
    public int getworkingHour()
    {
        return workingHour;
    }
    
    public String getstaffName()
    {
        return staffName;
    }
    
    public String getjoiningDate()
    {
        return joiningDate;
    }
    
    public String getqualification()
    {
        return qualification;
    }
    
    public String getappointedBy()
    {
        return appointedBy;
    }
    
    public boolean getjoined()
    {
        return joined;
    }
    //creating setter method to set the value of salary. It sets the salary only if joined is false else it will display a message//
    public void setsalary(int salary)
    {   
        if(joined==false)//control statement//
        {
        this.salary=salary;
        }
        else
        {       
            System.out.println("The Salary cannot be changed");
        }
  
    }
    //Creating setter method for workingHour//
    public void setworkingHour(int workhour)
    {
        this.workingHour=workhour;
    }
    
    public void fullTimeStaff(String staffName, String joiningDate, String qualification,String appointedBy)
    //this method will accept data for appointing a full-time staff//
    {
        if(joined==false) //control statement//
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
        else
        {
            System.out.println("The Following Staff Has Already Been Appointed:-");
            System.out.println("Staff's Name: "+getstaffName());
            System.out.println("Joined Date: "+getjoiningDate());
        }
    }
    public void disinfo()
    //this method displays the details in stored in the class FullTimeStaffHire//
    //this method works only when the staff has not joined else it will display a message//
    {
        super.display();
        
        if(joined==true)//control statement//
        {
        System.out.println("Staff's Name: "+getstaffName());
        System.out.println("Salary: "+getsalary());
        System.out.println("Working Hour: "+getworkingHour());
        System.out.println("Joined Date: "+getjoiningDate());
        System.out.println("Qualification: "+getqualification());
        System.out.println("Appointed By: "+getappointedBy());
        System.out.println("---------------------------------");
        }
        else
        {
            System.out.println("The Staff Hasn't Been Hired Yet");
        }
    
   
    }
}
// class closed//