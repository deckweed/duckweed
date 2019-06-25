package com.conpay.component.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UniteController {
    @RequestMapping("/uniteTest/{componentName}/{componentMethod}")
    public ResponseEntity<String> uniteController(String componentName, String componentMethod, HttpServletRequest request){
        ResponseEntity<String> res = null;
        return res;
    }
}
