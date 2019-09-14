package apptracker.demo.Controllers;

import apptracker.demo.Models.JobApp;
import apptracker.demo.Services.JobAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JobAppController {
    @Autowired
    JobAppService jobAppService;

    @PostMapping(path="/jobapp/add")
    public String addJobApp(@RequestBody JobApp incoming){
       jobAppService.save(incoming);
        return "Saved";
    }
    @GetMapping(path="/jobapp/all")
    public Iterable<JobApp> getAllJobApp() {


        return jobAppService.returnAll();}
}
