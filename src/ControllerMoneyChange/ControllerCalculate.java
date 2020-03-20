package ControllerMoneyChange;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerCalculate {

    @GetMapping("/displayMoney")
    public String displayMoney(HttpServletRequest request) {

        Float money = Float.valueOf(request.getParameter("money")) * 23000;
        request.setAttribute("money", money);

        return "displayMoney";
    }

    @GetMapping("/inputMoney")
    public String inputMoney() {
        return "inputMoney";
    }
}
