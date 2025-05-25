package gr.aueb.cf.helloapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // SSR - Αν γυρνούσε Data θα τον λέγαμε @RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/coding")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello all!"); // ψευδώνυμο και value
        return "index"; // Δε χρειάζεται η κατάληξη
    }


    @GetMapping("/welcome")
//    @RequestMapping(path = "/welcome", method = RequestMethod.GET) Αυτή είναι η μετάφραση του απο πάνω
    public String sayWelcome(@RequestParam(defaultValue = "guest")String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
