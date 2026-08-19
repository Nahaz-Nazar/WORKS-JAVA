package com.hr.system;


class StaffMember {
    
    private String workerName;
    private int identificationNo;
    private String assignedDept;
    private double monthlyPay;

    
    public String getWorkerName() {
        return workerName;
    }
    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

   
    public int getIdentificationNo() {
        return identificationNo;
    }
    public void setIdentificationNo(int identificationNo) {
        this.identificationNo = identificationNo;
    }

    
    public String getAssignedDept() {
        return assignedDept;
    }
    public void setAssignedDept(String assignedDept) {
        this.assignedDept = assignedDept;
    }

   
    public double getMonthlyPay() {
        return monthlyPay;
    }
    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }
}


public class RegistryApplication {
    public static void main(String[] args) {
        
        StaffMember staff1 = new StaffMember();
        staff1.setWorkerName("Rohan Sharma");
        staff1.setIdentificationNo(1001);
        staff1.setAssignedDept("Human Resources");
        staff1.setMonthlyPay(55000.00);

        
        StaffMember staff2 = new StaffMember();
        staff2.setWorkerName("Ananya Iyer");
        staff2.setIdentificationNo(1002);
        staff2.setAssignedDept("Engineering");
        staff2.setMonthlyPay(82500.50);

        
        System.out.println("======================================");
        System.out.println("          HR REGISTRY SYSTEM          ");
        System.out.println("======================================");
        
        System.out.println("Staff Member 1:");
        System.out.println("Name       : " + staff1.getWorkerName());
        System.out.println("ID Number  : " + staff1.getIdentificationNo());
        System.out.println("Department : " + staff1.getAssignedDept());
        System.out.println("Salary     : ₹" + staff1.getMonthlyPay());
        
        System.out.println("--------------------------------------");
        
        System.out.println("Staff Member 2:");
        System.out.println("Name       : " + staff2.getWorkerName());
        System.out.println("ID Number  : " + staff2.getIdentificationNo());
        System.out.println("Department : " + staff2.getAssignedDept());
        System.out.println("Salary     : ₹" + staff2.getMonthlyPay());
        System.out.println("======================================");
    }
}
