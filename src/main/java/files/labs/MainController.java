package files.labs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {
    @GetMapping("/team")
    public String team() {
        return "pages/team";
    }
    @GetMapping("/yasaswiS")
    public String yasaswiS() {
        return "pages/yasaswiS";
    }
    @GetMapping("/labs")
    public String labs() {
        return "pages/labs";
    }

    //pages not created yet - LABS
    @GetMapping("/fibonacci")
    public String fibonacci() { return "pages/labs/fibonacci";}
    @GetMapping("/rot")
    public String rot() { return "pages/labs/rot";}
    @GetMapping("/caesar")
    public String caesar() { return "pages/labs/caesar";}
    @GetMapping("/palindrome")
    public String palindrome() { return "pages/labs/palindrome";}

    @GetMapping("/pali")
    public String pali(@RequestParam(name="phrase", required=false,  defaultValue="racecar") String phrase, Model model) {
        Palindrome pali = new Palindrome();
        model.addAttribute("log1", pali.getLog1(phrase));
        return "pages/labs/palindrome";
    }
}
