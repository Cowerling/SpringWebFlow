package pizza.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2017-3-12.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }
}
