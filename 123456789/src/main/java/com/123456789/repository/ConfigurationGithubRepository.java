@Repository
public interface ConfigurationGithubRepository {
    
    public void navigateToSacralAiWebsite();
    
    public void loginToSacralAiWebsite();
    
    public void accessExpertServicesToChangeBusinessPage();
    
    public void clickOnConfigure();
    
    public void clickOnGitHub();
    
    public void provideGitHubUsernameAndPassword(String username, String password);
    
    public void provideGitHubURL(String url);
    
    public void provideGitHubRepositoryName(String repositoryName);
    
    public void clickOnResetButton();
    
    public void clickOnSaveButton();
    
    public Boolean validateJiraSoftwareCredentials();
    
    public void displayErrorMessageIfCredentialsAreNotValid(String message);
    
    public void displayListWithTitleUserNameURLAction();
    
    public void displayEditButtonAndDeleteButton();
    
    public void changeNumberOfEntriesToDisplayInTheList();
    
    public void displayPaginationUnderTheList();
    
    public void clickOnPaginationToChangePageNumbers();
    
    public void displayAddMoreButtonAboveTheList();
    
    public void clickOnAddMoreButtonToConfigureOtherGithub();
    
    public void displayPopUpForm();
    
    public void enterRequiredDetails();
    
    public void saveConfigure();
    
    public void verifyNavigationToSacralAiWebsiteAndSuccessfulLogin();
    
    public void verifyAccessToExpertServicesToChangeBusinessPage();
    
    public void verifyClickOnConfigure();
    
    public void verifyClickOnGitHub();
    
    public void verifyPopUpFormDisplay();
    
    public void verifyUserPromptedToEnterGitHubCredentials();
    
    public void verifyClickOnResetButton();
    
    public void verifyClickOnSaveButton();
    
    public void verifyGitHubConfigurationAfterSaveButton();
    
    public void verifyJavaAPIAuthenticationOfGitHubCredentials();
    
    public void verifyListDisplayWithTitleUserNameURLAction();
    
    public void verifyEditAndDeleteButtons();
    
    public void verifyChangeNumberOfEntriesToDisplayInList();
    
    public void verifyPaginationUnderTheList();
    
    public void verifyClickOnPaginationToChangePageNumbers();
    
    public void verifyAddMoreButtonAboveTheList();
    
    public void verifyPopUpFormDisplayOnClickOfAddMoreButton();
    
    public void verifyEnterRequiredDetails();
    
    public void verifyClickOnSaveButtonToConfigure();
}