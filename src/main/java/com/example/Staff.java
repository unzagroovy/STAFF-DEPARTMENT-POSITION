package com.example;

public class Staff {

        private String name;
        private int age;
        private String email;
        private Department department; 
        private Position position;
    
        public Staff(String name, int age, String email, Department department, Position position)
        {
                      this.setName(name);
                      this.setAge(age);
                      this.setDepartment(department);
                      this.setEmail(email);
                      this.setPosition(position);             
        }
        
        public void setName(String name)
        {
            this.name = name;
        }
    
        public void setAge(int age)
        {
            this.age = age;
        }
    
        public void setDepartment(Department department)
        {
            this.department = department;
        }
    
        public void setEmail(String email)
        {
            this.email = email;
        }
    
        public void setPosition(Position position)
        {
            this.position = position;
        }
        
        public String getName()
        {
            return name;
        }
    
        public int getAge()
        {
            return age;
        }
    
        public String getEmail()
        {
            return email;
        }
    
        public Position getPosition()
        {
            return position;
        }
    
        public String getDEpartment()
        {
            return department.getName();
        }
    
        public String toString()
        {
            return  "\nStaff:\nName: " + name + "\nAge: " + age + "\nEmail: " + email + "\nDepartment: " + department.getName() +
             "\n" + position.toString();
        }
    }
     

