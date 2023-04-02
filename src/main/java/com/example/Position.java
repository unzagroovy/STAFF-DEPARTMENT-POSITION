package com.example;

public class Position {

        private String title;
        private double salary;
    
        public Position(String title, double salary)
        {
               this.setTitle(title);
               this.setSalary(salary);
        }
    
        public void setTitle(String title)
        {
            this.title = title;
        }
    
        public void setSalary(double salary)
        {
            this.salary = salary;
        }
    
        public String getTitle()
        {
            return title;
        }
    
        public double getSalary()
        {
            return salary;
        }
    
        public String toString()
        {
            return "Position [title: " + title + ", salary: " + salary + "]";
        }
    
    }
    
    

