package org.launchcode.Lineupcard.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class LineupController {

    public static String[] positions = {"P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"};
    public static HashMap currentLineup = new HashMap();

    @RequestMapping(value = "")
    public String index(Model model) {
        if(currentLineup.isEmpty()){
            for(String position: positions){
                currentLineup.put(position, "empty");
            }
        }
        model.addAttribute("positions", positions);
        model.addAttribute("currentLineup", currentLineup);
        return "index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String addPlayer(Model model){
        model.addAttribute("positions", positions);
        return "add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String addToLineup(@RequestParam String position,
                              @RequestParam String player) {
        currentLineup.put(position, player);
        return "redirect:";
    }

}
