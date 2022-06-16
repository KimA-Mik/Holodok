package ru.jobster.holodok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.jobster.holodok.dao.CompanyDAO;
import ru.jobster.holodok.models.CompanyModel;

@Controller
@RequestMapping(value = "providers")
public class ProvidersController {
    private final CompanyDAO companyDAO;

    public ProvidersController(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }

    @GetMapping("")
    public String providersPage(Model model){
        return "providers/main";
    }

    @GetMapping("/list")
    public String providersList(Model model){
        model.addAttribute("companies" , companyDAO.getAllCompanies());
        return "providers/list";
    }

    @GetMapping("/add")
    public String providersAdd(Model model){
        return "providers/edit";
    }

    @GetMapping("/{id}")
    public String providersShow(@PathVariable("id") int id, Model model){
        CompanyModel companyModel = companyDAO.getCompanyModelOrNull(id);

        if (companyModel != null){
            model.addAttribute("company",companyModel);
            return "providers/companyPage";
        }
        return "providers/emptyCompanyPage";
    }

}

