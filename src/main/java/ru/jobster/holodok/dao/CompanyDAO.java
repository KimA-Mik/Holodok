package ru.jobster.holodok.dao;

import org.springframework.stereotype.Component;
import ru.jobster.holodok.models.CompanyModel;

import javax.annotation.PreDestroy;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyDAO {
    private final Connection connection;

    public CompanyDAO(){
        this.connection = JdbcConnection.getConnection();
    }

    public CompanyModel getCompanyModelOrNull(int id){
        CompanyModel companyModel = null;

        try {
            String sql = "SELECT * FROM companies WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(id, 1);
            var res = preparedStatement.executeQuery();
            if (res.next()){
                int ID = res.getInt("id");
                String companyName = res.getString("company_name");
                String address = res.getString("company_address");
                String directorMame = res.getString("company_director_name");
                String chiefAccountantName = res.getString("company_chief_accountant_name");

                companyModel = new CompanyModel(ID, companyName, address, directorMame, chiefAccountantName);
            }
        }catch (SQLException ex){
            System.err.println(ex.getMessage());
        }

        return companyModel;
    }

    public List<CompanyModel> getAllCompanies(){
        List<CompanyModel> allModels = new ArrayList<>();
        try {
            String sql = "SELECT * FROM companies";
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(sql);

            while (res.next()){
                int id = res.getInt("id");
                String companyName = res.getString("company_name");
                String address = res.getString("company_address");
                String directorMame = res.getString("company_director_name");
                String chiefAccountantName = res.getString("company_chief_accountant_name");

                allModels.add(new CompanyModel(id, companyName, address, directorMame, chiefAccountantName));
            }
        }catch (SQLException ex){
            System.err.println(ex.getMessage());
        }

        return allModels;
    }

    public boolean addCompany(CompanyModel model){

        return false;
    }

    @PreDestroy
    public void close() {
        try {
            connection.close();
        }catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

}
