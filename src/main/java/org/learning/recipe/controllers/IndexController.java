package org.learning.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({"/","","/index"})
    public String getIndex() {
        log.debug("something changed!!! abcd");
        return "index";
    }
}
