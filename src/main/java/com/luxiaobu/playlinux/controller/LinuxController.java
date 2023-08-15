package com.luxiaobu.playlinux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwh11
 */
@RestController
public class LinuxController {

    @GetMapping("/hello")
    public String hello() {
        return "ok";
    }
}
