package com.learn.spring_boot_rest.Controller;

import com.learn.spring_boot_rest.model.JobPost;
import com.learn.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//  instant of use @ResponseBody for json data use in @RestController in @Controller Place for json data, if we not use these two, the @Controller by default treat View in UI/UX form
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
    
    
//    Return 1 job post
    @GetMapping("jobPosts/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

//    add the job
    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

//    Update the job
    @PutMapping (path = "jobPost", produces = {"application/json"})
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

//    Delete the job
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Successfully Deleted postId:  " + postId;
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }

}
