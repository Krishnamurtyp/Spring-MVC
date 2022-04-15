package com.mvcclass.mvp.controller;

import com.mvcclass.mvp.model.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @PostMapping("registration")
    public String setRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {

        if(result.hasErrors()){
            logger.error("Invalid model "+registration.toString());
            result.getAllErrors().stream().forEach(error->logger.error(error.getDefaultMessage()));
            return "registration";
        }
        logger.info("Registration : " + registration.toString());
        return "redirect:registration";
    }

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration";
    }
}
