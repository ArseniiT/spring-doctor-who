package com.example.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {
    private String [] doctors = {
        "Patrick Troughton",
        "William Hartnell",
        "Jon Pertwee",
        "Tom Baker",
        "Peter Davison",
        "Colin Baker",
        "Sylvester McCoy",
        "Paul McGann",
        "John Hurt",
        "Christopher Eccleston",
        "David Tennant",
        "Matt Smith",
        "Peter Capaldi",
        "Jodie Whittaker"
    };

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doc1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doc10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doc13() {
        return "Jodie Whittaker";
    }

//    @GetMapping("/doctor/{id}")
//    @ResponseBody
//    public String index(@PathVariable int id) {
//        return this.doctors[id];
//    }
}
