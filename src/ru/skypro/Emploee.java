package ru.skypro;


public class Emploee{

    private String FIO;
    private int department;
    private double salary;
    public static int idEm;
    public static int id;

    public Emploee (String FIO, int department, double salary){

        this.FIO=FIO;
        this.department=department;
        this.salary=salary;
        id++;
        idEm=id;

    }

    public String toString(){
        return FIO + "  " + department + "  " + salary + "  " +  idEm;
    }

    public String getFIO(){
        return FIO;
    }

    public int getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public int getIdEm(){
        return idEm;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void setDepartment(int department){
        this.department=department;
    }
}
