package com.emin.hrms.api.controller;

import com.emin.hrms.business.abstracts.SocialMediaService;
import com.emin.hrms.core.utilities.results.Result;
import com.emin.hrms.core.utilities.results.SuccessResult;
import com.emin.hrms.entities.concretes.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/socialmedias")
@CrossOrigin
public class SocialMediaController {

    private SocialMediaService socialMediaService;

    @Autowired
    public SocialMediaController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @PostMapping("/addsocialmedia")
    public Result addSocialMedia(@RequestBody SocialMedia socialMedia){
        this.socialMediaService.addSocialMedia(socialMedia);
        return new SuccessResult("Sosyal medya eklemesi başarılı.");
    }

}
