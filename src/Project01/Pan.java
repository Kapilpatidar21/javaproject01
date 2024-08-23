package Project01;

public class Pan {
    private String panNumber ;
    private String aadhaarNumber;
    private String investments ;
    private String bankDetails;

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Pan(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Pan(String panNumber, String aadhaarNumber, String investments,String bankDetails) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.investments = investments;
        this.bankDetails= bankDetails;

    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", investments='" + investments + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                '}';
    }
}
