package com.social.login.common.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageController.class);

    protected static final String VIEW_NAME_HOMEPAGE = "index";

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showHomePage() {
        LOGGER.debug("Rendering homepage.");
        return VIEW_NAME_HOMEPAGE;
    }
}
