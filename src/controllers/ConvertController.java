package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ConvertController {
    @GetMapping("/")
    public String getConvert() {
        return "index";
    }
    @PostMapping(path = "/index")
    public ModelAndView viewVND(@RequestParam float usd, @RequestParam float rate, Model model) {
        float vnd=usd*rate;
        model.addAttribute("vnd", vnd);
        return new ModelAndView("viewVND","vnd",vnd);
    }
}
