package apptracker.demo.Repositories;

import apptracker.demo.Models.JobApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JobAppRepo extends JpaRepository <JobApp, Integer>{

}
