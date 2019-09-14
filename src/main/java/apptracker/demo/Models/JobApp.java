package apptracker.demo.Models;

import javax.persistence.*;

@Entity
public class JobApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String companyName;
    private String refNumber;
    private String jobTitle;
    private String dateApplied;
    private String source;

    private boolean phoneScreen;
    private boolean assessment;
    private boolean inPersonInterview;
    private boolean companyRejected;
    private boolean youRejected;
    private boolean offerrecieved;
    private boolean noResponse;
    private Integer interestLevel;
    private boolean offerAccepted;
    private boolean emailAutomatedClosed;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }

    public boolean isPhoneScreen() {
        return phoneScreen;
    }

    public void setPhoneScreen(boolean phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    public boolean isInPersonInterview() {
        return inPersonInterview;
    }

    public void setInPersonInterview(boolean inPersonInterview) {
        this.inPersonInterview = inPersonInterview;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isAssessment() {
        return assessment;
    }

    public void setAssessment(boolean assessment) {
        this.assessment = assessment;
    }

    public Integer getInterestLevel() {
        return interestLevel;
    }

    public void setInterestLevel(Integer interestLevel) {
        this.interestLevel = interestLevel;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isCompanyRejected() {
        return companyRejected;
    }

    public void setCompanyRejected(boolean companyRejected) {
        this.companyRejected = companyRejected;
    }

    public boolean isYouRejected() {
        return youRejected;
    }

    public void setYouRejected(boolean youRejected) {
        this.youRejected = youRejected;
    }

    public boolean isOfferrecieved() {
        return offerrecieved;
    }

    public void setOfferrecieved(boolean offerrecieved) {
        this.offerrecieved = offerrecieved;
    }

    public boolean isNoResponse() {
        return noResponse;
    }

    public void setNoResponse(boolean noResponse) {
        this.noResponse = noResponse;
    }

    public boolean isOfferAccepted() {
        return offerAccepted;
    }

    public void setOfferAccepted(boolean offerAccepted) {
        this.offerAccepted = offerAccepted;
    }

    public boolean isEmailAutomatedClosed() {
        return emailAutomatedClosed;
    }

    public void setEmailAutomatedClosed(boolean emailAutomatedClosed) {
        this.emailAutomatedClosed = emailAutomatedClosed;
    }
}
