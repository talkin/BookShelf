package com.app.Controller;

import com.app.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtao on 1/6/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String getUser(ModelMap model){
        model.addAttribute("user", new User());

        List<String> genderLists = new ArrayList<String>();
        genderLists.add("Male");
        genderLists.add("Female");
        model.addAttribute("genders", genderLists);

        return "userLogin";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String updateUser(@ModelAttribute User user, ModelMap model){
        model.addAttribute("user", user);
        return "profile";
    }

}
