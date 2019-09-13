package apptracker.demo.Repositories;

import apptracker.demo.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepo extends JpaRepository <Company, Integer>{

    List<Company> findAllByCompanyName(String companyName);
}
