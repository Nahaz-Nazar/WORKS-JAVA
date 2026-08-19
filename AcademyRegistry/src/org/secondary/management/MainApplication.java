package org.secondary.management;

class Scholar {
    private String fullName;
    private int identityNumber;
    private double finalGradePercentage;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public double getFinalGradePercentage() {
        return finalGradePercentage;
    }

    public void setFinalGradePercentage(double finalGradePercentage) {
        this.finalGradePercentage = finalGradePercentage;
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Scholar person = new Scholar();

        person.setFullName("Sophia Lin");
        person.setIdentityNumber(4022);
        person.setFinalGradePercentage(94.2);

        System.out.println("====== SCHOLAR RECORD ======");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("ID Number: " + person.getIdentityNumber());
        System.out.println("Academic Score: " + person.getFinalGradePercentage() + "%");
    }
}
