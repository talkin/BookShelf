package com.app;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.ui.velocity.VelocityEngineUtils;

/**
 * Created by jtao on 3/13/15.
 */
@Component
public class EmailHelper {

    @Autowired
    private VelocityEngine velocityEngine;

    public String getEmailText() {
        ModelMap model = new ModelMap();
        String requester = "tao";
        model.addAttribute("requester", requester);
        return VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "emailTemplate.vm", "UTF-8", model);
    }
}
