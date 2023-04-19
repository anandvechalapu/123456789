package com.123456789.service;

import com.123456789.repository.ConfigurationGithubRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationGithubService {

    @Autowired
    private ConfigurationGithubRepository repository;

    public void navigateToSacralAiWebsite(){
        repository.navigateToSacralAiWebsite();
    }

    public void loginToSacralAiWebsite(){
        repository.loginToSacralAiWebsite();
    }

    public void accessExpertServicesToChangeBusinessPage(){
        repository.accessExpertServicesToChangeBusinessPage();
    }

    public void clickOnConfigure(){
        repository.clickOnConfigure();
    }

    public void clickOnGitHub(){
        repository.clickOnGitHub();
    }

    public void provideGitHubUsernameAndPassword(String username, String password){
        repository.provideGitHubUsernameAndPassword(username, password);
    }

    public void provideGitHubURL(String url){
        repository.provideGitHubURL(url);
    }

    public void provideGitHubRepositoryName(String repositoryName){
        repository.provideGitHubRepositoryName(repositoryName);
    }

    public void clickOnResetButton(){
        repository.clickOnResetButton();
    }

    public void clickOnSaveButton(){
        repository.clickOnSaveButton();
    }

    public Boolean validateJiraSoftwareCredentials(){
        return repository.validateJiraSoftwareCredentials();
    }

    public void displayErrorMessageIfCredentialsAreNotValid(String message){
        repository.displayErrorMessageIfCredentialsAreNotValid(message);
    }

    public void displayListWithTitleUserNameURLAction(){
        repository.displayListWithTitleUserNameURLAction();
    }

    public void displayEditButtonAndDeleteButton(){
        repository.displayEditButtonAndDeleteButton();
    }

    public void changeNumberOfEntriesToDisplayInTheList(){
        repository.changeNumberOfEntriesToDisplayInTheList();
    }

    public void displayPaginationUnderTheList(){
        repository.displayPaginationUnderTheList();
    }

    public void clickOnPaginationToChangePageNumbers(){
        repository.clickOnPaginationToChangePageNumbers();
    }

    public void displayAddMoreButtonAboveTheList(){
        repository.displayAddMoreButtonAboveTheList();
    }

    public void clickOnAddMoreButtonToConfigureOtherGithub(){
        repository.clickOnAddMoreButtonToConfigureOtherGithub();
    }

    public void displayPopUpForm(){
        repository.displayPopUpForm();
    }

    public void enterRequiredDetails(){
        repository.enterRequiredDetails();
    }

    public void saveConfigure(){
        repository.saveConfigure();
    }

    public void verifyNavigationToSacralAiWebsiteAndSuccessfulLogin(){
        repository.verifyNavigationToSacralAiWebsiteAndSuccessfulLogin();
    }

    public void verifyAccessToExpertServicesToChangeBusinessPage(){
        repository.verifyAccessToExpertServicesToChangeBusinessPage();
    }

    public void verifyClickOnConfigure(){
        repository.verifyClickOnConfigure();
    }

    public void verifyClickOnGitHub(){
        repository.verifyClickOnGitHub();
    }

    public void verifyPopUpFormDisplay(){
        repository.verifyPopUpFormDisplay();
    }

    public void verifyUserPromptedToEnterGitHubCredentials(){
        repository.verifyUserPromptedToEnterGitHubCredentials();
    }

    public void verifyClickOnResetButton(){
        repository.verifyClickOnResetButton();
    }

    public void verifyClickOnSaveButton(){
        repository.verifyClickOnSaveButton();
    }

    public void verifyGitHubConfigurationAfterSaveButton(){
        repository.verifyGitHubConfigurationAfterSaveButton();
    }

    public void verifyJavaAPIAuthenticationOfGitHubCredentials(){
        repository.verifyJavaAPIAuthenticationOfGitHubCredentials();
    }

    public void verifyListDisplayWithTitleUser