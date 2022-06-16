package ru.jobster.holodok.forms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class CompanyForm {

    @NotNull
    @Size(min=2, max=30)
    private String companyName;

    @NotNull
    @Size(min=10, max=100)
    private String companyAddress;

    @NotNull
    @Size(min=2, max=30)
    private String companyDirectorName;

    @NotNull
    @Size(min=2, max=30)
    private String companyChiefAccountantName;


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
