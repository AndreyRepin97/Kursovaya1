package ru.skypro;


public class Main {

    public static int family(Emploee[] emploees) {
        for (int i = 0; i < emploees.length; i++) {
            if(emploees[i] == null) {
                break;
            } else {
                System.out.println(emploees[i].getFIO());
            }
        }
        return 0;
    }

    public static double sumSal(Emploee[] emploees) {
        double sum = 0;
        for (int i = 1; i < emploees.length; i++) {
            sum = sum + emploees[i].getSalary();
        }
        System.out.println(sum);
        return sum;
    }

    public static double minSal(Emploee[] emploees) {
        double min = 999999;
        for (int i = 0; i < emploees.length; i++) {
            if (emploees[i] == null) {
                break;
                } else {
                if (emploees[i].getSalary() < min) {
                    min = emploees[i].getSalary();
                }
            }
        }
        System.out.println(min);
        return min;
    }

    public static double maxSal(Emploee[] emploees){
        double max=0;
        for(int i = 0; i < emploees.length; i++){
            if(emploees[i]==null) {
                break;
            }else{
                if(emploees[i].getSalary() > max)
                max = emploees[i].getSalary();
            }
        }
        System.out.println(max);
        return max;
    }

    public static double sredSal(Emploee[] emploees){
        double sred=0;
        double count=1;
        for(int i = 1; i < emploees.length; i++){
            if(emploees[i]!=null) {
                count++;
            }
                sred=sred+emploees[i].getSalary();
            }
        sred=sred/count;
        System.out.println(sred);
        return sred;
    }

    public static void main(String[] args) {
        Emploee[] emploees = new Emploee[5];


        emploees[0]=new Emploee("Ivanov Ivan Ivanovich", 1, 15000);
        emploees[1]=new Emploee("Vladimirov Vladimir Vladimirovich", 2, 17000);
        emploees[2]=new Emploee("Alexandrov Alexandr Alexandrovich", 3, 18500);
        emploees[3]=new Emploee("Petrov Petr Petrovich", 1, 13750);
        emploees[4]=new Emploee("Andreev Andrey Andreevich", 2, 14250);
        System.out.println(emploees[0].toString());
        System.out.println(emploees[1].toString());
        System.out.println(emploees[2].toString());
        System.out.println(emploees[3].toString());
        System.out.println(emploees[4].toString());

        sumSal(emploees);
        minSal(emploees);
        maxSal(emploees);
        sredSal(emploees);
        family(emploees);

    }
}



