package br.com.unifalmg.zoo.controller;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.service.AnimalService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Log4j2
@Controller
@AllArgsConstructor
public class ZooController {

//    private final AnimalService service;
//
//    @GetMapping("/")
//    public String getHome() {
//        return "home";
//    }
//
//    @GetMapping("/users")
//    public String user(Model model) {
//        List<Animal> users = service.getAllUsers();
//        model.addAttribute("users", users);
//        return "users";
//    }
//
//    @GetMapping("/user")
//    public String user(Animal user) {
//        return "newuser";
//    }
//
//    @PostMapping("/user")
//    public String newUser(@ModelAttribute("user") Animal user) {
//        // TODO: Add the new user
//        // service.add || service.save
//        log.info("Entrou no cadastro de usuário");
//        Animal addedUser = service.add(user);
//        return "redirect:/user/" + addedUser.getId();
//    }
//
//    @GetMapping("/user/{id}")
//    public String showUser(@PathVariable("id") Integer id,
//                           Model model) {
//        Animal user = service.findById(id);
//        model.addAttribute("user", user);
//        return "showuser";
//    }

}
