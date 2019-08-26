package org.launchcode.Lineupcard.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.launchcode.Lineupcard.models.Player;
import org.launchcode.Lineupcard.models.PlayerData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class LineupController {

    public static String[] positions = {"P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"};
    public static HashMap<String, Player> currentLineup = new HashMap();
    public PlayerData playerData = new PlayerData();

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("positions", positions);
        model.addAttribute("currentLineup", currentLineup);
        return "index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String addToLineup(Model model){
        model.addAttribute("positions", positions);
        model.addAttribute("players", playerData.getPlayers());
        return "add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String addToLineup(@RequestParam String position,
                              @RequestParam int playerId) {
        Player player = playerData.findById(playerId);
        currentLineup.put(position, player);
        return "redirect:";
    }

    @RequestMapping(value="addPlayer", method = RequestMethod.GET)
    public String addPlayer(Model model){
        return "addPlayer";
    }

    @RequestMapping(value="addPlayer", method = RequestMethod.POST)
    public String addPlayer(@ModelAttribute Player player){
        playerData.add(player);

        return "redirect:";
    }

}
