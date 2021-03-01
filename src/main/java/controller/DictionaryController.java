package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String,String> dictionary=new HashMap<>();
    static {
        dictionary.put("hello","Xin Chao");
        dictionary.put("bye","Tam Biet");
    }
    @GetMapping("/translate")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("translate");
        return modelAndView;
    }
    @PostMapping("/translate")
    public ModelAndView translate(String search){
        System.out.println("post run.");
        System.out.println(search);
        ModelAndView modelAndView = new ModelAndView("translate");
        String result = dictionary.get(search);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
