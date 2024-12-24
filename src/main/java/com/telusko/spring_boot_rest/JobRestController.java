package com.telusko.spring_boot_rest;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobPost(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

}
