package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.repo.JobRepo;
import com.telusko.spring_boot_rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
       jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
      return jobRepo.getAllJobs();
    }

}
