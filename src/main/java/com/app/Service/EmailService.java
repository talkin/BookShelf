package com.app.Service;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.ui.velocity.VelocityEngineUtils;

/**
 * Created by jtao on 3/12/15.
 */

@Service
public class EmailService {

    public String getEmailText() {
        VelocityEngine velocityEngine = new VelocityEngine();
        ModelMap model = new ModelMap();
        String requester = "tao";
        model.addAttribute("requester", requester);
        return VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "emailTemplate.vm", "UTF-8", model);
    }
}
