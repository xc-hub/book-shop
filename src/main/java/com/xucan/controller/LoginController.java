package com.xucan.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {
    //    小程序登录

    @RequestMapping("/login")
    public String rtPostObject(@RequestParam String code){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx6a8c8858f424c528&secret=a95ded034e59ff27cee992493f12e833&js_code="+code+"&grant_type=authorization_code";
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        ResponseEntity<String> response = restTemplate.getForEntity( url, String.class );
        System.out.println(response.getBody());
        return response.getBody();
    }
}
