package exspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/generos")
public class GeneroControler{
    @RequestMapping("list")
    public String list() {
        return "list";
    }
}