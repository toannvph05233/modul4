package controllerSandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSandwich {

    @GetMapping("/inputSandwich")
    public String inputEnglish() {
        return "inputSandwich";
    }

    @GetMapping("/displaySandwich")
    public String displayEnglish(@RequestParam String lettuce,
                                  String tomato,
                                  String mustard,
                                  String sprouts, Model model) {

        if (lettuce != null){
            model.addAttribute("lettuce", lettuce);
        }
        if (tomato != null) {
            model.addAttribute("tomato", tomato);
        }
        if (mustard != null) {
            model.addAttribute("mustard", mustard);
        }
        if (sprouts != null) {
            model.addAttribute("sprouts", sprouts);
        }

        return "displaySandwich";
    }
}

