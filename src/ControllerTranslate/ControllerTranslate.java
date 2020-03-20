package ControllerTranslate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Set;

@Controller
public class ControllerTranslate {
    HashMap<String, String> hashMapEnglish = new hashMapEnglish().getHashMapEnglish();

    @GetMapping("/inputEnglish")
    public String inputEnglish() {
        return "inputEnglish";
    }

    @GetMapping("/displayEnglish")
    public String displayEnglish(HttpServletRequest request) {
        String english = request.getParameter("english");
        String vietnam = null;
        for (String x : hashMapEnglish.keySet()) {
            if (x.equals(english)) {
                vietnam = hashMapEnglish.get(x);
            }
        }
        if (vietnam == null) {
            request.setAttribute("meseger", "không có trong từ điển");
            request.setAttribute("vietnam", "");
            request.setAttribute("english", english);
            return "displayEnglish";
        }else {
            request.setAttribute("meseger", "");
            request.setAttribute("vietnam", vietnam);
            request.setAttribute("english", english);
            return "displayEnglish";
        }
    }
}
