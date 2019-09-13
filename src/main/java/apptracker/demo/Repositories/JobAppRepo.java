package apptracker.demo.Repositories;

import apptracker.demo.Models.JobApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAppRepo extends JpaRepository <JobApp, Integer>{

}
