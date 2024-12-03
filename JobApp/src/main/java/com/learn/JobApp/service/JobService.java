package com.learn.JobApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.JobApp.model.JobPost;
import com.learn.JobApp.repo.JobRepo;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
