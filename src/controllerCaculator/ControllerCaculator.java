package controllerCaculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ControllerCaculator {
    @GetMapping("Caculator")
    public String caculator(@RequestParam int number1, int number2,String caculator, Model model) {
        switch (caculator){
            case "+":
                model.addAttribute("ketqua", number1 + number2);
                break;
            case "-":
                model.addAttribute("ketqua", number1 - number2);
                break;
            case "*":
                model.addAttribute("ketqua", number1 * number2);
                break;
            case "/":
                model.addAttribute("ketqua", number1 / number2);
                break;
        }
        return "Caculator";
    }

}