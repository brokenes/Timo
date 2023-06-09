package com.linln.devtools.swagger;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * 12/9
 */
@Controller
public class SwaggerController {

    @GetMapping("/dev/swagger")
    @RequiresPermissions("/dev/swagger")
    public String index(){
        return "redirect:/doc.html";
    }
}
