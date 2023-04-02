package com.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Department
 */
public class Department {

    private String name;
    private ArrayList<Staff> staffs; 


    public Department(String name)
    {
           this.setName(name); 
           staffs = new ArrayList<>();    
    }

    public void setName(String name)
    {
       this.name = name;
    }

    public String getName()
    {
       return name;
    }


    public ArrayList<Staff> getStaffs()
    {
        return staffs;
    }

    public void addStaff(Staff staff)
    {
        staffs.add(staff);
    }
    
    public void findStaffByPosition(String position)
    {   
        if (staffs.size() != 0)         
       {     Iterator<Staff> it = staffs.iterator();
            boolean exist = false;
            while (it.hasNext()) {
            Staff staff = it.next();
            if (staff.getPosition().getTitle().equals(position.toUpperCase())) {
                System.out.print("The staff you're looking for is, ");
                System.out.println(staff.toString());
                exist = true;
                break;
            }
            }

            if (!exist){
                System.out.println("Staff with the position: " + position + " does not exist");
            }
        }

        else 
        {
            System.out.println("Staff list is empty");
        }
    }


    public void removeStaffByPosition(String position)
    {   if (staffs.size() != 0)         
        {   Iterator<Staff> it = staffs.iterator();

            boolean exist = false;

            while (it.hasNext())
             {

                Staff staff = it.next();

                if (staff.getPosition().getTitle().equals(position.toUpperCase())) {
                    System.out.println("\nStaff list before removing the specified staff: ");
                    this.listStaffs();

                    System.out.println("Staff list after removing staff");
                    it.remove();
                    if (staffs.size() != 0)
                    this.listStaffs();

                    else 
                    System.out.println(staffs);

                    exist = true;
                        break;
            }

            }

            if (!exist){
            System.out.println("Staff with the position: " + position + " does not exist");
            }
      }
      else 
      {
        System.out.println("Staff list is empty");
      }
    }
        

    
    public void listStaffs()
    {
        for (Staff staff: staffs)
        {
           System.out.println(staff.toString()); 
           System.out.println();  
        }
    }


}

