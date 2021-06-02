package org.launchcode.spaday.controllers;


import org.launchcode.spaday.controllers.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model){
        model.addAttribute("title", "Add User");
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("email", user.getEmail());
        if (verify.equals(user.getPassword())){
            model.addAttribute("password", user.getPassword());
            UserData.add(user);
                    return "user/index";
        } else {
            model.addAttribute("errorMessage", "Sorry the passwords didn't match");
            return "user/add";
        }
    }
}
