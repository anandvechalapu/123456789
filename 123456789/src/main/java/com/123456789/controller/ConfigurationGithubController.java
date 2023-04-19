NameURLAction(){
        repository.verifyListDisplayWithTitleUserNameURLAction();
    }

    public void verifyNumberOfEntriesToDisplayInTheList(){
        repository.verifyNumberOfEntriesToDisplayInTheList();
    }

    public void verifyPaginationUnderTheList(){
        repository.verifyPaginationUnderTheList();
    }

    public void verifyEditButtonAndDeleteButton(){
        repository.verifyEditButtonAndDeleteButton();
    }

    public void verifyAddMoreButtonAboveTheList(){
        repository.verifyAddMoreButtonAboveTheList();
    }

    public void verifyNavigationToSacralAiWebsiteAndUnsuccessfulLogin(){
        repository.verifyNavigationToSacralAiWebsiteAndUnsuccessfulLogin();
    }

}

package com.123456789.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.123456789.model.JiraSoftware;
import com.123456789.service.JiraService;
import com.123456789.service.ConfigurationGithubService;

@RestController
public class ConfigurationGithubController {

    @Autowired
    private JiraService jiraService;

    @Autowired
    private ConfigurationGithubService configurationGithubService;

    @GetMapping("/findByUsername")
    public JiraSoftware findByUsername(@RequestParam("username") String username) {
        return jiraService.findByUsername(username);
    }

    @GetMapping("/findByPassword")
    public JiraSoftware findByPassword(@RequestParam("password") String password) {
        return jiraService.findByPassword(password);
    }

    @GetMapping("/findByUrl")
    public JiraSoftware findByUrl(@RequestParam("url") String url) {
        return jiraService.findByUrl(url);
    }

    @GetMapping("/findByRepositoryName")
    public JiraSoftware findByRepositoryName(@RequestParam("repositoryName") String repositoryName) {
        return jiraService.findByRepositoryName(repositoryName);
    }

    @PostMapping("/deleteByUsername")
    public void deleteByUsername(@RequestParam("username") String username) {
        jiraService.deleteByUsername(username);
    }

    @PostMapping("/deleteByPassword")
    public void deleteByPassword(@RequestParam("password") String password) {
        jiraService.deleteByPassword(password);
    }

    @PostMapping("/deleteByUrl")
    public void deleteByUrl(@RequestParam("url") String url) {
        jiraService.deleteByUrl(url);
    }

    @PostMapping("/deleteByRepositoryName")
    public void deleteByRepositoryName(@RequestParam("repositoryName") String repositoryName) {
        jiraService.deleteByRepositoryName(repositoryName);
    }

    @PostMapping("/navigateToSacralAiWebsite")
    public void navigateToSacralAiWebsite(){
        configurationGithubService.navigateToSacralAiWebsite();
    }

    @PostMapping("/loginToSacralAiWebsite")
    public void loginToSacralAiWebsite(){
        configurationGithubService.loginToSacralAiWebsite();
    }

    @PostMapping("/accessExpertServicesToChangeBusinessPage")
    public void accessExpertServicesToChangeBusinessPage(){
        configurationGithubService.accessExpertServicesToChangeBusinessPage();
    }

    @PostMapping("/clickOnConfigure")
    public void clickOnConfigure(){
        configurationGithubService.clickOnConfigure();
    }

    @PostMapping("/clickOnGitHub")
    public void clickOnGitHub(){
        configurationGithubService.clickOnGitHub();
    }

    @PostMapping("/provideGitHubUsernameAndPassword")
    public void provide