package apptracker.demo.Services;

import apptracker.demo.Models.JobApp;
import apptracker.demo.Repositories.JobAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobAppService {
    @Autowired
    JobAppRepo jobAppRepo;

    public void save(JobApp incoming){
        jobAppRepo.save(incoming);
    }
    public Iterable<JobApp> returnAll(){
        return jobAppRepo.findAll();
    }
}
