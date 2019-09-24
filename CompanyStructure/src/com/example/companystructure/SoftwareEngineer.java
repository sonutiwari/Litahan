package com.example.companystructure;

public class SoftwareEngineer extends TechnicalEmployee {
    private int codeCheckIns = 0;
    private boolean hasCodeAccess = false;

    SoftwareEngineer(String name) { super(name); }

    int getSuccessfulCodeCheckIns() {
        return codeCheckIns;
    }

    void setCodeCheckIns(int codeCheckIns) {
        this.codeCheckIns = codeCheckIns;
    }

    boolean getCodeAccess() {
        return hasCodeAccess;
    }

    private void setCodeAccess(boolean hasCodeAccess) {
        this.hasCodeAccess = hasCodeAccess;
    }

    public boolean checkInCode(){
        if (this.hasCodeAccess){
            this.setCodeCheckIns(this.getSuccessfulCodeCheckIns() + 1);
            return true;
        } else return false;
    }
    @Override
    public String employeeStatus(){
        return this.toString() +
                " has " + this.getSuccessfulCodeCheckIns()
                + " Successful Check ins";
    }
}
