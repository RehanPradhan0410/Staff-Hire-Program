/**
 * The class creates a vacancy and hires part-time staff
 *
 * @author (Rehan Pradhan)
 * @version (0.1)
 */


public class PartTimeStaffHire extends StaffHire
//This class is also a child class inherited from StaffHire//
{
    //declaring instance variable//
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shift;
    private boolean joined=false;
    private boolean terminated=false;
    //creating constructor to make an object//
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType, int workingHour, int wagesPerHour, String shift)
    {
        super(vacancyNo,designation,jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shift=shift;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    
    //creating getter methods which will return the values//
    public int getworkingHour()
    {
        return workingHour;
    }
    
    public int getwagesPerHour()
    {
        return wagesPerHour;
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
    
    public String getshift()
    {
        return shift;
    }
    
    public boolean getjoined()
    {
        return joined;
    }
    
    public boolean getterminated()
    {
        return terminated;
    }
    
    //creating setter method to set the shift//
    public void setshift(String shift)
    {
        if(joined==false)//control statement//
        {
            this.shift=shift;
            joined=true;
        }
        else
        {
            System.out.println("The Staff Has Already Been Appointed");
        }
    }
    
    public void HirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    //This method accepts the details of the appointed staff//
    {
        if (joined==false)//control statement//
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
        else
        {
            System.out.println("The Following Staff Has Already Been Appoined");
            System.out.println("Staff's Name: "+getstaffName());
            System.out.println("Join Date: "+getjoiningDate());
        }
    }
    
    public void terminate()
    //this method terminates a staff//
    {
        if(terminated==false)//control statement//
        {
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
        }
        else
        {
            System.out.println("The Staff Has Already Been Terminated");
        }
    }
    
    public void dispinf()
    //This method displays the details stored into PartTimeStaffHire//
    //this method works only when the staff has not joined else it will display a message//
    {
        super.display();
        if(joined==true)//control statement//
        {
            System.out.println("Staff's Name: "+getstaffName());
            System.out.println("Wage Per Hour: "+getwagesPerHour());
            System.out.println("Working Hour: "+getworkingHour());
            System.out.println("Joined Date: "+getjoiningDate());
            System.out.println("Qualification: "+getqualification());
            System.out.println("Appointed By: "+getappointedBy());
            System.out.println("Shift: "+getshift());
            System.out.println("Income Per Day: "+getwagesPerHour()*getworkingHour());
            System.out.println("---------------------------------");
        }
       else
       {
           System.out.println("The Vacancy Has Not Been Filled");
       }
    }
    
}
//class closed//
