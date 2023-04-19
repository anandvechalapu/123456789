package com.123456789.service;

import com.123456789.model.JiraSoftware;
import com.123456789.repository.JiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraService {

    @Autowired
    private JiraRepository jiraRepository;

    public JiraSoftware findByUsername(String username) {
        return jiraRepository.findByUsername(username);
    }

    public JiraSoftware findByPassword(String password) {
        return jiraRepository.findByPassword(password);
    }

    public JiraSoftware findByUrl(String url) {
        return jiraRepository.findByUrl(url);
    }

    public JiraSoftware findByRepositoryName(String repositoryName) {
        return jiraRepository.findByRepositoryName(repositoryName);
    }

    public void deleteByUsername(String username) {
        jiraRepository.deleteByUsername(username);
    }

    public void deleteByPassword(String password) {
        jiraRepository.deleteByPassword(password);
    }

    public void deleteByUrl(String url) {
        jiraRepository.deleteByUrl(url);
    }

    public void deleteByRepositoryName(String repositoryName) {
        jiraRepository.deleteByRepositoryName(repositoryName);
    }

}