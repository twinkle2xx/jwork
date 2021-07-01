package AilsaSyaffaDynia.jwork.controller;

import AilsaSyaffaDynia.jwork.*;
import org.springframework.web.bind.annotation.*;

/**
 * Class JobseekerController, untuk mengatur jobseeker dan terhubung ke jwork android
 * @author Ailsa Syaffa Dynia
 * @version 28-06-2021
 */

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * Untuk mendaptkan jobseeker dengan menggunakan id
     * @param id
     * @return jobseeker
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseeker.getJobseekerById(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    /**
     * Untuk melakukan login, dengan menggunakan email dan password yang telah terdaftar
     * @param email
     * @param password
     * @return (getJobseekerLogin(email,password))
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password)
    {
        return(DatabaseJobseeker.jobseekerLogin(email, password));
    }

    /**
     * Untuk melakukan proses register dari jobseeker
     * @param name
     * @param email
     * @param password
     * @return jobseeker
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseeker.getLastId()+1, name, email, password);
        try {
            if (jobseeker.getEmail().isEmpty())
                throw new Exception("Email regex not match!");
            if (jobseeker.getPassword().isEmpty())
                throw new Exception("Password regex not match!");
            DatabaseJobseeker.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }
}