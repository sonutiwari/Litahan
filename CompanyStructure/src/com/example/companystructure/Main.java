package com.example.companystructure;

public class Main {
    public static void main(String[] args) {
        TechnicalLead tl = new TechnicalLead("Sonu");
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer("Prashant");
        SoftwareEngineer softwareEngineer2 = new SoftwareEngineer("Pankaj");
        SoftwareEngineer softwareEngineer3 = new SoftwareEngineer("Sai Sekar");
        tl.addReport(softwareEngineer1);
        tl.addReport(softwareEngineer2);
        tl.addReport(softwareEngineer3);
        System.out.println(tl.getTeamStatus());
        SoftwareEngineer softwareEngineer4 = new SoftwareEngineer("Gunjan");
        SoftwareEngineer softwareEngineer5 = new SoftwareEngineer("Akshita");
        tl.addReport(softwareEngineer4);
        tl.addReport(softwareEngineer5);
        System.out.println(tl.getTeamStatus());
        System.out.println(softwareEngineer1.getManager());
        System.out.println(softwareEngineer5.getManager());
    }
}
