package com.app.Controller;

import com.app.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String exampleGet(ModelMap model){
        model.addAttribute("userForm", new UserForm());

        List<String> genderLists = new ArrayList<String>();
        genderLists.add("Male");
        genderLists.add("Female");
        model.addAttribute("genders", genderLists);

        return "userLogin";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String examplePost(ModelMap model, UserForm userForm){
        model.addAttribute("name", userForm.getName());
        model.addAttribute("password", userForm.getPassword());
        model.addAttribute("email", userForm.getEmail());
        model.addAttribute("location", userForm.getLocation());
        model.addAttribute("gender", userForm.getGender());
        model.addAttribute("notes", userForm.getNotes());

        return "profile";
    }

}
