package com.linln.devtools.build;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 8/14
 */
@Controller
@RequestMapping("/dev/build")
public class BuildController {

    @GetMapping
    public String index(Model model){
        return "/devtools/build/index";
    }
}
