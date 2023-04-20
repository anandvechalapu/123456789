·       User should be able to send email to NDM without login.·       User should be able to see the introduction of the NDM website.
public class NDMWebsite {

    private String introduction;
    private String goals;
    private String email;

    public NDMWebsite() {
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getGoals() {
        return goals;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void accessWithoutLogin() {
        System.out.println("Introduction to NDM website: " + introduction);
        System.out.println("Goals of NDM website: " + goals);
    }

    public void sendEmailToNDM() {
        System.out.println("Sending email to NDM from " + email);
    }
}