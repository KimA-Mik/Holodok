package ru.jobster.holodok.models;

public class CompanyModel {

    private int id;
    private String companyName;
    private String companyAddress;
    private String companyDirectorName;
    private String companyChiefAccountantName;

    public CompanyModel(int id, String companyName, String companyAddress, String companyDirectorName, String companyChiefAccountantName) {
        this.id = id;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyDirectorName = companyDirectorName;
        this.companyChiefAccountantName = companyChiefAccountantName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyDirectorName() {
        return companyDirectorName;
    }

    public void setCompanyDirectorName(String companyDirectorName) {
        this.companyDirectorName = companyDirectorName;
    }

    public String getCompanyChiefAccountantName() {
        return companyChiefAccountantName;
    }

    public void setCompanyChiefAccountantName(String companyChiefAccountantName) {
        this.companyChiefAccountantName = companyChiefAccountantName;
    }
}
