package com.example.companystructure;
import java.util.ArrayList;

public class TechnicalLead extends SoftwareEngineer {
    private ArrayList<SoftwareEngineer> directReportees = new ArrayList<>();
    TechnicalLead(String name) {
        super(name);
        this.setBaseSalary(this.getBaseSalary() * 1.3);
    }

    private boolean hasHeadCount(){
        int headCount = 4;
        return directReportees.size() < headCount;
    }

    boolean addReport(SoftwareEngineer e){
        if (hasHeadCount()){
            directReportees.add(e);
            e.setManager(this); // Setting manager for the employee
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIns(SoftwareEngineer e){
        boolean isReportee = false;
        for (SoftwareEngineer employee: directReportees) {
            if(employee.equals(e)){
                isReportee = true;
                break;
            }
        }
        if (isReportee && e.getCodeAccess()) e.setCodeCheckIns(e.getSuccessfulCodeCheckIns() + 1); // Setting code check ins
        return isReportee && e.getCodeAccess();
    }

    String getTeamStatus(){
        StringBuilder employees = new StringBuilder();
        for (SoftwareEngineer s: directReportees){
            employees.append(s.toString()).append("\n");
        }
        return this.toString() +
                " has " + this.getSuccessfulCodeCheckIns()
                + " Successful Check ins and is managing" + "\n" + employees ;
    }
}
