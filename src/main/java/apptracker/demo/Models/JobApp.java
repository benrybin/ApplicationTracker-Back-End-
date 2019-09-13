package apptracker.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Company companyName;
    private String refNumber;
    private String title;
    private String resumeVersion;
    private String dateApplied;
    private boolean phoneScreen;
    private boolean assment;
    private boolean inPersonInterview;
    private boolean rejected;
    private Integer intrestLevel;

}
