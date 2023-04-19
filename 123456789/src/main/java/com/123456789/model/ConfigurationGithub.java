package com.123456789.model;

public class ConfigurationGithub {
    private String username;
    private String password;
    private String url;
    private String repositoryName;
    private String message;
    private int entriesToDisplay;
    private int pageNumbers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getEntriesToDisplay() {
        return entriesToDisplay;
    }

    public void setEntriesToDisplay(int entriesToDisplay) {
        this.entriesToDisplay = entriesToDisplay;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
}